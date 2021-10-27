package com.example.antlr4exam;

import com.example.antlr4exam.grammar.ExprBaseVisitor;
import com.example.antlr4exam.grammar.ExprParser;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

@Slf4j
public class ExprCalcVisitor extends ExprBaseVisitor<String> {

    @Override
    public String visitProg(ExprParser.ProgContext ctx) {
        // "line+"
        StringBuilder sb = new StringBuilder();
        
        ctx.children.forEach(subtree -> sb.append(visit(subtree)).append("\n"));
        
        return sb.toString();
    }

    @Override
    public String visitLine(ExprParser.LineContext ctx) {       
        // "expr comment? NEWLINE"
        String ans = String.format("L%03d : %s", ctx.getStart().getLine(), visit(ctx.getChild(0)));
        log.info(ans);
        
        // comment
        for( int cnt = 1; cnt < ctx.getChildCount() ; cnt++) {
            log.info(visit(ctx.getChild(cnt)));
        }
        
        return ans;
    }

    @Override
    public String visitExpr(ExprParser.ExprContext ctx) {
        // If there is one child, that's Number.
        if (1 == ctx.getChildCount()) {
            return visitChildren(ctx);
        }

        // process "expr op expr"
        double left = Double.parseDouble(visit(ctx.getChild(0)));
        String op = visit(ctx.getChild(1));
        double right = Double.parseDouble(visit(ctx.getChild(2)));
        double ans = 0.0;
        
        switch (op) {
            case "+":
                ans = left + right;
                break;
            case "-":
                ans = left - right;
                break;
            case "*":
                ans = left * right;
                break;
            case "/":
                ans = left / right;
                break;
        }
        
        log.debug("{} {} {} = {}", left, op, right, ans);
        
        return Double.toString(ans);
    }

    @Override
    public String visitParents_expr(ExprParser.Parents_exprContext ctx) {
        // "( expr )"
        // process "expr"

        String ans = visit(ctx.getChild(1));
        log.debug("({})", ans);

        return ans;
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        return node.getText();
    }

    @Override
    public String visitErrorNode(ErrorNode node) {
        log.error("ERROR");
        return null;
    }
    
    // EXAMINATION: Process the comment nodes by the AspectJ.
    //@Override public String visitComment(ExprParser.CommentContext ctx) { log.info("COMMENT");return visitChildren(ctx); }
}

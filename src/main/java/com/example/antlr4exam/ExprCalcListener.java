package com.example.antlr4exam;

import com.example.antlr4exam.grammar.ExprListener;
import com.example.antlr4exam.grammar.ExprParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ExprCalcListener extends BaseListener implements ExprListener {
    @Override
	public void enterStartRule(ExprParser.StartRuleContext ctx) {
        dumpEnter("START RULE");
    }
    @Override
	public void exitStartRule(ExprParser.StartRuleContext ctx) {
        dumpExit("START RULE");
    }    
    @Override
    public void enterLine(ExprParser.LineContext ctx) {
        dumpEnter("LINE");
    }

    @Override
    public void exitLine(ExprParser.LineContext ctx) {
        dumpExit("LINE");
    }

    @Override
    public void enterExpr(ExprParser.ExprContext ctx) {
        dumpEnter("EXPR");
    }

    @Override
    public void exitExpr(ExprParser.ExprContext ctx) {
        dumpExit("EXPR");
    }

    @Override
    public void enterProg(ExprParser.ProgContext ctx) {
        dumpEnter("PROG");
    }

    @Override
    public void exitProg(ExprParser.ProgContext ctx) {
        dumpExit("PROG");
    }

    @Override
    public void visitTerminal(TerminalNode tn) {
        dump(tn.getPayload().toString());
    }

    @Override
    public void visitErrorNode(ErrorNode en) {
        dump("Error!");
    }

    @Override
    public void enterEveryRule(ParserRuleContext prc) {
    }

    @Override
    public void exitEveryRule(ParserRuleContext prc) {
    }

    @Override
    public void enterParents_expr(ExprParser.Parents_exprContext ctx) {
        dumpEnter("PARENTS");
    }

    @Override
    public void exitParents_expr(ExprParser.Parents_exprContext ctx) {
        dumpExit("PARENTS");
    }

    @Override
    public void enterComment(ExprParser.CommentContext ctx) {
        dumpEnter("COMMENT");
    }

    @Override
    public void exitComment(ExprParser.CommentContext ctx) {
        dumpExit("COMMENT");
    }
    
}

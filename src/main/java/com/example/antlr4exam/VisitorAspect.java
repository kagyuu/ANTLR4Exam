package com.example.antlr4exam;

import com.example.antlr4exam.grammar.ExprBaseVisitor;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.ParserRuleContext;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Slf4j
public class VisitorAspect {

    @Around("execution(public * com.example.antlr4exam.grammar.ExprBaseVisitor.visit*(..))")
    public Object aroundExecute(ProceedingJoinPoint thisJoinPoint) throws Throwable {

        Class targetClass = thisJoinPoint.getSignature().getDeclaringType();
        String targetMethod = thisJoinPoint.getSignature().getName();
        Object targetObject = thisJoinPoint.getTarget();

        if (targetClass.equals(ExprBaseVisitor.class)) {
            // The method in the ExperBaseVisitor class was invoked.
            // On the other word, this method is not defined in user defined class such as the ExperCalcVisitor.
            
            if (targetObject instanceof ExprCalcVisitor) {
                // If ExprCalcVisitor (extends ExprBaseVisitor) was invoked and invoked method was not defined in ExprCalcVisitor,
                // the node of the ANTLR4 will be processed following code.
                
                log.debug("********** hijacked: {}#{} {}", targetClass.getName(), targetMethod, targetObject.getClass().getName());
                ParserRuleContext ctx = (ParserRuleContext) (thisJoinPoint.getArgs()[0]);
                
                // In this exmple, simply connect texts of child nodes.
                StringBuilder sb = new StringBuilder();
                for (int cnt = 0; cnt < ctx.getChildCount(); cnt++) {
                    sb.append(ctx.getChild(cnt).getText()).append(" ");
                }
                return sb.toString().trim();
            } 
            //else if (targetObject instanceof ExprOTHERVisitor) {
            //   If ExprOTHERVisitor (extends ExprBaseVisitor) was invoked and ...
            //}
        }

        return thisJoinPoint.proceed(thisJoinPoint.getArgs());
    }
}

package com.example.antlr4exam;

import java.io.File;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

public class ExprCalcTest {

    @Test
    public void test() throws Exception {
        try {
            ExprCalcGenerator target = new ExprCalcGenerator();
            String answers = target.calcAnser(new File(Thread.currentThread().getContextClassLoader().getResource("calc.txt").toURI()));
            assertThat(answers, is("L001 : 2.0\nL002 : 14.0\nL003 : 1.5714285714285714\n"));
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

}

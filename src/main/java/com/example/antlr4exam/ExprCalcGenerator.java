package com.example.antlr4exam;

import com.example.antlr4exam.grammar.ExprLexer;
import com.example.antlr4exam.grammar.ExprParser;
import com.example.antlr4exam.grammar.ExprParser.ProgContext;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

@Slf4j
public class ExprCalcGenerator {

    public static final void main(String[] args) {
        try {
            String answers = (new ExprCalcGenerator()).calcAnser(new File(args[0]));
            System.out.printf(answers);
        } catch (IOException ex) {
            log.error("ERROR", ex);
            System.exit(-1);
            
        }
    }
    
    public String calcAnser(File calcFiles) throws FileNotFoundException, IOException {
        CharStream stream = CharStreams.fromFileName(calcFiles.getAbsolutePath(), Charset.forName("UTF-8"));
        ExprLexer lexer = new ExprLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        
        // Attach listener. I think listener is only available for logging.
        ExprCalcListener listener = new ExprCalcListener();
        parser.addParseListener(listener);

        // Create tree from the document.
        ProgContext prog = parser.prog();
        // Create visitor.
        ExprCalcVisitor visitor = new ExprCalcVisitor();
        // Process tree using visitor.
        String result = prog.accept(visitor);

        return result;
    }
}

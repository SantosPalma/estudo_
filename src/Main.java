import dominio.*;
import org.junit.Test;
import test.java.BankStatementCSVParseTest;

import java.io.IOException;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{

    public static void main(final String[] args) throws Exception {


        final BankStatementeAnalyzer bankStatementeAnalyzer = new BankStatementeAnalyzer();
        final BankStatementParser bankStatementParser = new BankStatementCSVParser();
            bankStatementeAnalyzer.analyze(args[0], bankStatementParser);



    }
}
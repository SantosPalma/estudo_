package dominio;

import dominio.interfaces.BankStatementParser;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankStatementCSVParser implements BankStatementParser {

    private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    private BankTransaction parceFromCSV(final String line){
        final String[] columns = line.split(",");

        final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
        final double amount = Double.parseDouble(columns[1]);
        final String description = columns[2];
        return new BankTransaction(date, amount, description);
    }
    public List<BankTransaction> parseLinesFromCSV(final List<String> lines){
        final List<BankTransaction> bankTransactions = new ArrayList<>();

        for (String line: lines){
            bankTransactions.add(parceFromCSV(line));
        }
        return bankTransactions;
    }

    @Override
    public BankTransaction parseFrom(String line) {
        return null;
    }

    @Override
    public List<BankTransaction> parseLinesFrom(List<String> lines) {
        return List.of();
    }
}

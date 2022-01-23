import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class CsvReader {
    private String filePath;
    private Scanner scanner;
    private String delimiter;
    ArrayList<CsvObjectCreator> bill = new ArrayList<CsvObjectCreator>();

    public CsvReader(String filePath) throws FileNotFoundException {
    this.filePath = filePath;
    scanner.useDelimiter(delimiter);
    scanner = new Scanner(new File(filePath));

    do{
        CsvObjectCreator csv = new CsvObjectCreator();
        csv.setRow(Integer.parseInt(scanner.next()));
        csv.setTransactionDate(Integer.parseInt(scanner.next()));
        csv.setTransactionHour(Integer.parseInt(scanner.next()));
        csv.setTransactionType(Integer.parseInt(scanner.next()));
        csv.setTerminalType(Integer.parseInt(scanner.next()));
        csv.setPrice(Integer.parseInt(scanner.next()));
        csv.setPresistentNumber(Integer.parseInt(scanner.next()));
        csv.setLandDate(Integer.parseInt(scanner.next()));
        csv.setTerminalNumber(Integer.parseInt(scanner.next()));
        csv.setReferNumber(Integer.parseInt(scanner.next()));
        bill.add(csv);

    }while(scanner.hasNext());
    }





}

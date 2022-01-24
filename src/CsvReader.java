import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class CsvReader {
    private String filePath;
    private Scanner scanner;
    private String delimiter;
    private ArrayList<CsvObjectCreator> bill = new ArrayList<CsvObjectCreator>();

    public CsvReader(String filePath,String delimiter)  {
        this.filePath = filePath;
//        scanner.useDelimiter(delimiter);

    }
    public void collectionCreator()throws FileNotFoundException {
        scanner = new Scanner(new File(this.filePath));
        scanner.useDelimiter(",");
        do {
            CsvObjectCreator csv = new CsvObjectCreator();
            csv.setRow((scanner.nextInt()));
            csv.setTransactionDate((scanner.nextInt()));
            csv.setTransactionHour((scanner.nextInt()));
            csv.setTransactionType((scanner.nextInt()));
            csv.setTerminalType((scanner.nextInt()));
            csv.setPrice((scanner.nextInt()));
            csv.setPresistentNumber((scanner.nextInt()));
            csv.setLandDate((scanner.nextInt()));
            csv.setTerminalNumber((scanner.nextInt()));
            csv.setReferNumber((scanner.nextInt()));
            bill.add(csv);

        } while (scanner.hasNext());
    }

    public ArrayList<CsvObjectCreator> getBill() {
        return bill;
    }





}

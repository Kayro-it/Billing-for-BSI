import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class TransactionProccessor {
    private ArrayList<String> terminalList = new ArrayList<>();
    private Scanner filePath;
    private CsvReader report;


    public TransactionProccessor() throws IOException {
    filePath = new Scanner(System.in);
    report = new CsvReader(filePath.nextLine());
    report.collectionCreator();


    }
    public void terminalSeperator(){

}

}

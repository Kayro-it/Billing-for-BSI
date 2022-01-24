import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        String filePath;
        filePath = scanner.nextLine();

        TransactionProccessor report =new TransactionProccessor();
        report.setFilePath(filePath);

        report.terminalSeperator();

    }
}

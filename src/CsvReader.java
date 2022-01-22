import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class CsvReader {
    private String filePath;
    private Scanner scanner;
    private String delimiter;
    int input;
    public CsvReader(String filePath) throws FileNotFoundException {
    this.filePath = filePath;
    scanner.useDelimiter(delimiter);
    scanner = new Scanner(new File(filePath));

    do{


    }while((input = scanner.next()) != -1);
    }





}

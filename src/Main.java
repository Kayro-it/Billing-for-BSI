import java.io.IOException;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();

        TransactionProccessor transaction = new TransactionProccessor();
        transaction.setFilePath(filePath);
        transaction.terminalSeperator();

        Iterator<Integer> it = transaction.getArray().iterator();
        if(it.hasNext()){
            System.out.println(it.next());
        }

}
}

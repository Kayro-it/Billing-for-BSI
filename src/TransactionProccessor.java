import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;



public class TransactionProccessor {
    private ArrayList<Integer> terminalList = new ArrayList<>();
    private ArrayList<TransactionDetails> terminal = new ArrayList<>();
    private String filePath;
    private CsvReader report;


    public TransactionProccessor() throws IOException {
    report = new CsvReader(filePath,",");
    report.collectionCreator();


    }
    public void terminalSeperator(){
        Iterator<CsvObjectCreator> it = report.getBill().iterator();
        if(it.hasNext()){
            int input;
            if(!terminalList.contains(input = it.next().getTerminalNumber())){
                terminalList.add(input);
            }

        }
}

    public void setFilePath(String filePath){
        this.filePath = filePath;
    }



}

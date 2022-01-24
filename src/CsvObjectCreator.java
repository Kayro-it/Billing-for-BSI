public class CsvObjectCreator {
    private String row;
    private String  transactionDate;
    private String transactionHour;
    private String transactionType;
    private String terminalType;
    private String price;
    private String presistentNumber;
    private String landDate;
    private String referNumber;
    private String terminalNumber;

    public CsvObjectCreator(){

    }


    public void setRow(String row) {
        this.row = row;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setTransactionHour(int transactionHour) {
        this.transactionHour = transactionHour;
    }

    public void setTransactionType(int transactionType) {
        this.transactionType = transactionType;
    }

    public void setTerminalType(int terminalType) {
        this.terminalType = terminalType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPresistentNumber(int presistentNumber) {
        this.presistentNumber = presistentNumber;
    }

    public void setLandDate(int landDate) {
        this.landDate = landDate;
    }

    public void setTerminalNumber(int terminalNumber) {
        this.terminalNumber = terminalNumber;
    }

    public void setReferNumber(int referNumber) {
        this.referNumber = referNumber;
    }

    public int getRow() {
        return row;
    }

    public int getTransactionDate() {
        return transactionDate;
    }

    public int getTransactionHour() {
        return transactionHour;
    }

    public int getTransactionType() {
        return transactionType;
    }

    public int getTerminalType() {
        return terminalType;
    }

    public int getPrice() {
        return price;
    }

    public int getPresistentNumber() {
        return presistentNumber;
    }

    public int getLandDate() {
        return landDate;
    }

    public int getReferNumber() {
        return referNumber;
    }

    public int getTerminalNumber() {
        return terminalNumber;
    }

}

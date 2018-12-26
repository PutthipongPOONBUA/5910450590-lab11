public class Account {
    private String accountName;
    private int accountNum;

    public Account(int accountNumber, String accountName) {
        this.accountNum = accountNum;
        this.accountName = accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountNumber() {
        return accountNum;
    }

    public String toString() {
        return "{accountNumber="+accountNum+
                ",accountName="+accountName+"}";
    }
}


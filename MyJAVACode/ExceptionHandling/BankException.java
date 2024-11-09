/**
 * InnerBankException
 */
class InnerBankException extends Exception{
    String messege,acc;
    int bal;
    public InnerBankException(String messege,String acc,int bal) {
        this.messege=messege;this.acc=acc;this.bal=bal;
    }
    public void info()
    {
        System.out.println("--"+this.messege+"--");
        System.out.println("Acc No. "+this.acc+"\n"+"Balance: "+this.bal);
    }
}
class Account
{
    String acc_no,name;
    int bal;
    public Account(String acc_no,String name,int bal)
    {
        this.acc_no=acc_no;
        this.name=name;
        this.bal=bal;
    }
    void withdraw(int amt) throws InnerBankException
    {
        if(this.bal-amt<=0)
           throw new InnerBankException("Insufficient Balance!!",this.acc_no,this.bal);
    }
}

public class BankException {
    public static void main(String[] args) {
        Account acc = new Account("5035565454","Tanmay Roy",300);
        try {
            acc.withdraw(6456546);
        } catch (InnerBankException e) {
            e.info();
        }
    }
}

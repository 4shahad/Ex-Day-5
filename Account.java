package ExDay5;

public class Account {
    private String Id;
    private String Name ;
    private  int Balance= 0 ;

    public Account(String id, String name) {
        Id = id;
        Name = name;
    }

    public Account(String id, String name, int balance) {
        Id = id;
        Name = name;
        Balance = balance;
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public int getBalance() {
        return Balance;
    }


    @Override
    public String toString() {
        return "Account{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Balance=" + Balance +
                '}';
    }

    public int credit(int amount){
        int theNewBalance= amount+ getBalance();
         Balance  = theNewBalance;
        return Balance;
    }
    public int debit(int amount){
        if (amount<=Balance){
       int theNewBalance =getBalance()-amount;
            Balance  = theNewBalance;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
   return Balance; }
    public int transferTo (Account onother,int amount){
        if (amount<=Balance){
            Balance=Balance-amount;
           onother.Balance=amount;


        }
        else {
            System.out.println("Amount exceeded balance");
        }
   return onother.Balance; }

}

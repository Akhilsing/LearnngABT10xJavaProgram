package Practice_Java;

public class Practice_09_Bank_Methods {
    /*
    Syntax:
    accessModifier nonstatic or static returnType methodName(Parameters)
       {
      //Method Body
      return value;
      }
     */
    static int currentBalance=1000;
    public static void greeting(){
        System.out.println("Hello, welcome to the bank");
    }
    // parameter are assigned in method, because I need to get the amount from user
    public void deposit(int amount){
        currentBalance = currentBalance+ amount;
        System.out.println("Successfully amount is deposited" +amount);
    }
    public static void withdraw(int amount){
        currentBalance=currentBalance-amount;
        System.out.println("Successfully amount is withdraw" + amount);
    }
    public int getCurrentBalance(){
       int a=10;

        return a;
    }

    public static void main(String[] args) {
        Practice_09_Bank_Methods Bank = new Practice_09_Bank_Methods();
        System.out.println("CurrentBalance is " + Bank.getCurrentBalance());
        Bank.deposit(200);
        System.out.println("CurrentBalance is" + currentBalance);
        withdraw(100);
        System.out.println("CurrentBalance is " + Bank.getCurrentBalance());
    }
}

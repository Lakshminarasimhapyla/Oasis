import java.util.*;
public class AtmInterface
{
	public static void main(String[] args)
	{
        System.out.println("/**********************************************************************/");
        System.out.println(" ");
        System.out.println(" *** ATM INTERFACE *** ");
        System.out.println(" ");
        System.out.println("/**********************************************************************/");
        Scanner s=new Scanner(System.in);
        int deposit=0,Withdraw=0,balance=10000;
        int total;
        while(true)
        {
            System.out.println("\n1.Withdraw \n2.Deposit \n3.Transaction Details \n4.checckBalance\n5.Quit");
            System.out.print("\n Enter your choice : ");
            int num=s.nextInt();
            switch(num)
            {
                case 1: System.out.println(" ");
                        System.out.println(" *** Withdraw Amount *** ");
                        System.out.println(" ");
                        System.out.print( " Enter The Amount : ");
                        int withdraw=s.nextInt();
                        if(balance >=withdraw)
                        {
                        Withdraw=Withdraw+withdraw;
                        balance=balance-withdraw;
                        System.out.println(" Withdraw Amount :"+withdraw);
                        System.out.println(" Please collect your money ");
                        System.out.println(" ");
                        System.out.println("--------------------------------------------------------------------------");
                        }
                        else
                        {
                            System.out.println(" Insufficient Amount ");
                            System.out.println(" ");
                            System.out.println("--------------------------------------------------------------------------");
                        }
                        break;
                        
                case 2: System.out.println(" ");
                        System.out.println(" *** Deposit *** ");
                        System.out.println(" ");
                        System.out.print(" Please enter the amount for deposit :");
                        int Deposit=s.nextInt();
                        balance=balance+Deposit;
                        deposit=deposit+Deposit;
                        System.out.println(" Deposited Amount  :"+Deposit);
                        System.out.println("Your Amount is Deposited ");
                        System.out.println(" ");
                        System.out.println("--------------------------------------------------------------------------");
                        break;
                        
                case 3: System.out.println(" ");
                        System.out.println(" *** Transaction Details *** ");
                        System.out.println(" ");
                        System.out.println("Total deposited  amount :"+deposit);
                        System.out.println("Total withdrawal amount :"+Withdraw);
                        System.out.println("Your Total Balance :"+balance);
                        System.out.println(" ");
                        System.out.println("--------------------------------------------------------------------------");
                        break;
                        
                case 4: System.out.println(" ");
                        System.out.println(" *** check Balance *** ");
                        System.out.println(" ");
                        System.out.println("Your total balance is :"+balance);
                        System.out.println(" ");
                        System.out.println("--------------------------------------------------------------------------");
                        break;
                        
                case 5: System.out.println(" ");
                        System.out.println(" Please collect your card ");
                        System.out.println(" ");
                        System.out.println( " you are Exited !");
                        System.out.println(" ");
                        System.out.println("--------------------------------------------------------------------------");
                        System.exit(0);
                        
            }
        }
    }	
}
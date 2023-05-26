import java.util.*;
class MCQ
{
    Scanner s=new Scanner(System.in);
    int total=0;
    public void method1()
    {
        System.out.println("Please Answer Given questions ");
        System.out.println("1.Number of premite Data Types in Java ?\n a.six \n b.seven \n c.eight \n d.ten");
        System.out.println("Choose your option ");
        String ans=s.next();
        if(ans.equals("c"))
        {
            System.out.println("Correct !");
            total+=1;
        }
        else
        {
            System.out.println(" correct answer is Eight ");
        }
    }
    public void method2()
    {
        System.out.println("2.What is the size of float and double in java? \n a.32 and 64 \n b. 32 and 32 \n c.64 and 32 \n d.64 and 64 ");
        System.out.println("Choose your option ");
        String ans=s.next();
        if(ans.equals("a"))
        {
             System.out.println("Correct !");
             total+=1;
        }
        else
        {
            System.out.println(" correct answer is 32 and 64 ");
        }
    }
    public void method3()
    {
        System.out.println("3.When an array is passed to a method, what does the method receive? \n a.The reference of the array \n b.A copy of the array \n c.Length of the array \n d.Copy of first element ");
        System.out.println("Choose your option ");
        String ans=s.next();
        if(ans.equals("a"))
        {
             System.out.println("Correct !");
             total+=1;
        }
        else
        {
            System.out.println(" correct answer is Reference of the array");
        }
    }
    public void method4()
    {
        System.out.println(" Who invented java ? \n  a.James Gosling \n b.James \n c.Guido van Rossum \n Dennis Ritchie ");
        System.out.println("Choose your option ");
        String ans=s.next();
        if(ans.equals("a"))
        {
             System.out.println("Correct !");
             total+=1;
        }
        else
        {
            System.out.println(" correct answer is Reference of the array");
        }
        System.out.println(" Total Score 4 out off "+total);
        System.out.println(" Thanks for attempt all Questions !");
    }
}
class login extends MCQ
{
    public void loginn()
    {
        String name="";
        String pass="";
        System.out.println("Enter user name : ");
        name=s.next();
        System.out.println( " Enter user Password :");
        pass=s.next();
    if(name.equals("Narasimha") && pass.equals("1234"))
    {
        System.out.println("log in successfully ");
        MCQ m=new MCQ();
        m.method1();
        m.method2();
        m.method3();
        m.method4();
    }
    else{
        System.out.println(" Invalid Username or Password Try again !");
       }
    }
}
class Exam extends login
{
    public static void main(String []args)
    {
        login n=new login();
        n.loginn();
    }
}
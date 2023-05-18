import java.util.Random;
import java.util.Scanner;
class guess_number
{
    public static void main(String [] args )
    {
        	Scanner s=new Scanner(System.in);
        	Random r=new Random();
		int count=0;
       	for(int i=0;i<10;i++)
        		{
        			int computer_num=r.nextInt(101);
        			System.out.println("Enter Guess a  Number from 1 to 100");
	    			int user_num=s.nextInt();
	    			if(computer_num==user_num)
	    				{
	    	    			System.out.println("  congrats ! You guess correct number  that is "+computer_num);
					count++;
					System.out.println("Your total points is out of "+i+" :"+count);
					break;
				    	}
	    			else if(computer_num > user_num && i!=9)
	    				{
	        			System.out.println(" oops! you guess low number , actual number  is  "+computer_num);
					System.out.println("You have "+(9-i)+"chance");
				     }
	 		   else if(computer_num < user_num && i!=9 && user_num <=100 && user_num>0)
	   			     {
	      			System.out.println(" oops! you guess high  number , actual number  is "+computer_num);
					System.out.println("You have "+(9-i)+"chance");
	   			    }
	 		   else if(user_num>100)
			    {
	 		       System.out.println("Please enter a number from 1 to 100");
			  }
				else
			{
				System.out.println("Thanks for playing !");
				System.out.println("Your total points After all Chances :"+count);
            }
		}
 	 }
}
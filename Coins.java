import java.util.Scanner;
public class Coins
{
    public static void main(String[] args)
    {
      //gettting user input
      int cents;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number of cents that you have: ");
      cents = input.nextInt();
      
      //calculations
      int numQs = cents/25;
      int change1 = cents%25;
      int numDs = change1/10;
      int change2 = change1%10;
      int numNs = change2/5;
      int numPs = change2%5;
     
      
      //output
      System.out.print("Your change would be\n" + numQs + " Quarters,\n"
                        		        + numDs + " Dimes,\n"
                      			        + numNs + " Nickles,\n"
                      	               + "and " + numPs + " Pennies.");
    }
  
}
      
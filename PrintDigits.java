public class PrintDigits 
{
    public static void main(String[] args) 
    {
        System.out.println("The reverse of the entered 2 digit # is " + reverseDigits(45));
    }

    public static int reverseDigits(int number) 
    {
        if (number == 0)
        {
            return number;
        }
        
        else 
        {
            int x = number%10;
            int y = number/10;
            int a = Integer.parseInt(Integer.toString(x) + Integer.toString(y));
            return a;

        }
    }
}
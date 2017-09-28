import java.util.Random;
public class parallelogramDimensions
{
   public static void main(String[] args) 
   {
      Random rand = new Random();
      int base = rand.nextInt(10) + 30;
      int height = rand.nextInt(10) + 30;
      int side = rand.nextInt(10) + 30;
      
      double area = base * height;
      double perimeter = 2*(side+base);
      
      System.out.print("The area is " + area + " square units"
           + "\nand the perimeter is " + perimeter + " units");
      
      
      
   }

}
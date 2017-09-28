public class Die
{
   //here you declare your attributes
   private int faceValue;
   public String color;
   
   //operations
   //constructor - 
   public Die(String Color)
   {
     //body of constructor
     //declaring color
     Color = color;
     
     faceValue=(int)(Math.random()*6)+1;//instead of 1, use random approach to generate it
   }
   
   //roll operation
   public void roll()
   {
      faceValue=(int)(Math.random()*6)+1;
    }
    
    //adding a comboDie method
    public void comboDie(Die die1, Die die2)
    {
      System.out.println("The color of die 1 is " + die1.getColor() + " and its facevalue is " + die1.getFaceValue());
      System.out.println("The color of die 2 is " + die2.getColor() + " and its facevalue is " + die2.getFaceValue());
      System.out.println(die1.getColor() + "-" + die2.getColor() + "Facevalue: " +(die1.getFaceValue() + die2.getFaceValue())/2.0);
    }
    
    //add a getter method
    public int getFaceValue()
    {
        return faceValue;
      }
    
    //adding a color getter
    public String getColor()
    {
      return ("The color is " + color);
    }
    
    //add a setter method
    public void setFaceValue(int value)
    {
      faceValue=value;
    }
    
    //adding a color setter
    public void setColor(String colorSet)
    {
      color = colorSet; 
    }
    //add a toString() method
    public String toString()
    {
      String result = Integer.toString(faceValue);

      return result;
    }
}
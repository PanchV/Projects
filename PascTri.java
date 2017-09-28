public class PascTri
{
   public static void main(String[] args)
   {
      int numList[] = new int[0]; 
      int[] list = {2,3};
      nthLine(list, 9);
   }   
   
   static void nthLine(int origList[], int desiredLine) 
   { 
      int newList[] = new int[origList.length + 1]; 
      newList[0] = 1; 
      
      for (int i = 1; i < origList.length; i++) 
         newList[i] = origList[i - 1] + origList[i]; 
      
      newList[newList.length - 1] = 1;
      
      for (int i = 0; i < newList.length; i++) 
         System.out.print(newList[i] + " "); 
         
      if (newList.length < desiredLine) 
         nthLine(newList, desiredLine); 
} 
}    
      
      



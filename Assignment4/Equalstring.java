package Dec17;

import java.util.Scanner;

public class Equalstring {
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
  
        
      
        System.out.println("Enter the first string: ");
        String string1 = in.nextLine();
  
    
        
        System.out.println("Enter the second string :");
  
        String string2 = in.nextLine();
        System.out.println("\nAre both strings same: ");
  
        if (string1.equals(string2) == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

}

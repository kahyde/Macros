
package macros;

import java.util.Scanner;

/**
 * @author kelseyhyde
 */
public class Macros {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Welcome to this macro counter! Please enter your total calories: ");
        int calories = in.nextInt();
        
        Macro macro = new Macro(calories);
        
        System.out.println("Enter your fat percentage: ");
        int fat = in.nextInt();
        System.out.println("Enter your carbs percentage: ");
        int carbs = in.nextInt();
        System.out.println("Enter your protein percentage: ");
        int protein = in.nextInt();
        
        macro.setMacros(fat, carbs, protein);
        System.out.println(macro.printMacros());
    }
    
}

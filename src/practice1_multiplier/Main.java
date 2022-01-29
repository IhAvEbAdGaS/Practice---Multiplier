
package practice1_multiplier;
import java.util.Scanner;
/**
 *
 * @author Travi_groes869
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    static Multiplier jeremy = new Multiplier();
    
    
    public static void main(String[] args) {
        System.out.println("Welome to the multiplier!");
        System.out.println("Please enter a number to be multiplied");
        int multiplier = sc.nextInt();
        System.out.println("Enter how the maximum number to be multiplied by");
        int multiplier2 = sc.nextInt();
        jeremy.calculate(multiplier, multiplier2);
            
        }
        
        
        
        
    }

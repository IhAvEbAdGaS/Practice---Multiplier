
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
        
        jeremy.calculate(sc.nextInt(), 1);
            
        }
        
        
        
        
    }

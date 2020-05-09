 
package market;
 
import java.util.Scanner;

public class Market {
 
    public static void main(String[] args) {
        System.out.println("Welcom to my market ");
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        
        System.out.println("entre your id : ");
        user.id = scanner.nextInt();
        System.out.println("entre your name : ");
        user.name = scanner.next();
        System.out.println("entre your email : ");
        user.email = scanner.next();
        System.out.println("entre your password : ");
        user.password = scanner.next();       
        System.out.println("entre your phone : ");
        user.phone = scanner.next();

        System.out.println("entre your address : ");
        user.address = scanner.next(); 
        
        
    }
    
}

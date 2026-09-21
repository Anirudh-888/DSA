import java.util.*;
public class PinAttemptChecker{
    public static void main(String[] args) {
        int attempt = 0;
        while(attempt<3){
            System.out.println("Enter the pin for the transaction");
            Scanner sc = new Scanner(System.in);
            int pin = sc.nextInt();
            if(pin==0000){
                System.out.println("Correct pin entered");
                break;
            }
            else{
                System.out.println("The entered pin is wrong");
                attempt=attempt+1;
                System.out.println("The remaining attempts"+(3-attempt));
            }

        }
    }
}
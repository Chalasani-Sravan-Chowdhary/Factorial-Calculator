import java.util.Scanner;
public class CalculatorFactorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to find the factorial : ");
        int number = scanner.nextInt();

        if(isPositive(number)){
           long factorial = factorial(number);
           System.out.println(" The factorial of the given integer "+number+" is " + factorial);
        }else{
            System.out.println(" The given integer cannot have a factorial because it is a negative number");
        }
        scanner.close();
    }

    public static boolean isPositive(int number) {
        if(number<0){
            return false;
        }
    return true;
    }
    public static long factorial(int number) {
        long factorial = 1;
        if(number==0){
            return 1;
        }
        for (int i = 1; i <= number; i++) {
            factorial *= i;    
        }
        return factorial;
    }

}
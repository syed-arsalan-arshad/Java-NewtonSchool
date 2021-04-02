import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        char op;
        char check;
        do{
            System.out.println("Choose Operation To Perform: +, -, /, %, *");
            op = sc.next().charAt(0);
            System.out.println("Enter Two Integer Value: ");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            System.out.println("Your Answer Is: "+Calculator.calculate(n1, n2, op));
            System.out.println("If You Want To Calculate Again Type Y/N");
            check = sc.next().charAt(0);
        }while(check == 'Y' || check == 'y');
    }

    public static int calculate(int n1, int n2, char op) {
        switch(op){
            case '-':
                return n1-n2;
               
            case '*':
                return n1*n2;
           
            case '/':
                return n1/n2;
         
            case '%':
                return n1%n2;
        
            default:
                return n1+n2;
        }
    }
    
}

public class Assignment_Fundamental_Of_Java {
    static void  printHelloWorld()
    {
        // your code here
        System.out.println("Hello World");
    }
    static int  MaxInteger(int a ,int b, int c){
        //Enter your code here
        if(a >= b && a >= c){
            return a;
        }
        else if(b >= a && b >= c){
            return b;
        }
        else{
            return c;
        }
    }
    static int SimpleInterest(int P, int R, int Tm){
        //enter your code here
        return (P*R*Tm)/100;
    }
    static int FahrenheitToCelsius(int F){
        //Enter your code here
        
        int c = ((F - 32) * 5)/9;
        return c;
    }

    public static void main(String[] args) {
        int F = 77;
        System.out.println(Assignment_Fundamental_Of_Java.FahrenheitToCelsius(F));
        int P = 42, R = 8, Tm = 15;
        System.out.println(Assignment_Fundamental_Of_Java.SimpleInterest(P, R, Tm));
        int a = 5, b = 6, c = 10;
        System.out.println(Assignment_Fundamental_Of_Java.MaxInteger(a, b, c));
        Assignment_Fundamental_Of_Java.printHelloWorld();
    }
    
}

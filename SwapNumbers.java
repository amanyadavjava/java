// WAP to swap two numbers with and without using third variable using function in java
public class SwapNumbers {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        
        swapWithVariable(num1, num2);
        
        System.out.println("After swapping with variable: num1 = " + num1 + ", num2 = " + num2);
    }
    
    public static void swapWithVariable(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

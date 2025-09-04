import java.util.Scanner;


public class LeeOwenReview1
{
    private static Scanner scan = new Scanner (System.in);
    
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
    
    public static void q1_add3 (){
        int num1, num2, num3;
        System.out.println("Input your first number");
        num1 = scan.nextInt();
        System.out.println("Input your second number");
        num2 = scan.nextInt();
        System.out.println("Input your third number");
        num3 = scan.nextInt();
        System.out.println("The sum is " + (num1+num2+num3) + ".");
        
    }
    
    public static void q2_avg3 (){
        int num1, num2, num3;
        System.out.println("Input your first number");
        num1 = scan.nextInt();
        System.out.println("Input your second number");
        num2 = scan.nextInt();
        System.out.println("Input your third number");
        num3 = scan.nextInt();
        int sum = num1+num2+num3;
        System.out.println("The average is " + (sum/3.0) + ".");
    }
    
    public static void q3_avgMark (){
        int mark1, mark2, mark3, mark4;
        System.out.println("Input your first mark");
        mark1 = scan.nextInt();
        System.out.println("Input your second mark");
        mark2 = scan.nextInt();
        System.out.println("Input your third mark");
        mark3 = scan.nextInt();
        System.out.println("Input your fourth mark");
        mark4 = scan.nextInt();
        int sum = mark1 + mark2 + mark3 + mark4;
        System.out.println("The average is " + (sum/4.0) + ".");
    }
    
    public static void q4_avgMarkRound (){
        int mark1, mark2, mark3, mark4;
        System.out.println("Input your first mark");
        mark1 = scan.nextInt();
        System.out.println("Input your second mark");
        mark2 = scan.nextInt();
        System.out.println("Input your third mark");
        mark3 = scan.nextInt();
        System.out.println("Input your fourth mark");
        mark4 = scan.nextInt();
        int sum = mark1 + mark2 + mark3 + mark4;
        double avg = sum/4.0;
        System.out.println("The average is " + (Math.round(avg * 10.0) / 10.0) + ".");
    }
    
    public static void q5_mathOperations (){
        int num1, num2;
        System.out.println("Input first integer between 1 and 9");
        num1 = scan.nextInt();
        
        System.out.println("Input second integer between 1 and 9");
        num2 = scan.nextInt();
        
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));
        System.out.println(num1 + " ^ " + num2 + " = " + Math.pow(num1, num2));
        
    }
    
    public static void q6_findLarger(){
        double num1, num2;
        
        System.out.println("Enter first number");
        num1 = scan.nextDouble();
        
        System.out.println("Enter second number");
        num2 = scan.nextDouble();
        
        if (num1 > 
    }
}



























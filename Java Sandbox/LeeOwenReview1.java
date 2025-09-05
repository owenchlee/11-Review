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
        
        if (num1 > num2){
            System.out.println(num1 + " is the larger number.");
        } else if (num2 > num1){
            System.out.println(num2 + " is the larger number.");
        } else {
            System.out.println("They are the same");
        }
    }
    
    public static void q7_threeSum(){
        int userAns;
        int correct = 0;
        int counter = 0;
        while (counter < 3){
            int random1 = (int)(Math.random() * 101); 
            int random2 = (int)(Math.random() * 101); 
            System.out.println("What is " + random1 + " + " + random2 + "?");
            userAns = scan.nextInt();
            if (userAns == random1 + random2){
                correct++;
                System.out.println("Correct!");
            } else{
                System.out.println("Incorrect, the correct answer is " + (random1+random2));
            }
            counter++;
        }
        System.out.println("You got " + correct + " correct answers.");
    }
    
    public static void q8_smallestValue(){
        double num1, num2, num3;
        double smallest;
        
        System.out.println("Enter first number");
        num1 = scan.nextDouble();
        
        System.out.println("Enter second number");
        num2 = scan.nextDouble();
        
        System.out.println("Enter third number");
        num3 = scan.nextDouble();
        
        if (num1 < num2){
            smallest = num1;
        } else{
            smallest = num2;
        }
        
        if (smallest < num3){
            System.out.println(smallest + " is the smallest.");
        } else{
            System.out.println(num3 + " is the smallest.");
        }
    }
    
    public static void q9_ageClassication(){
        int age;
        
        System.out.println("What is your age?");
        age = scan.nextInt();
        
        if (age < 13){
            System.out.println("You are a child.");
        } else if (age < 20){
            System.out.println("You are a teenager.");
        } else if (age < 66){
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }
    }
    
    public static void q10_barGraph(){
        int val1, val2, val3, val4, val5;
        
        System.out.println("Enter first number between 1 and 50");
        val1 = scan.nextInt();
        
        System.out.println("Enter second number between 1 and 50");
        val2 = scan.nextInt();
        
        System.out.println("Enter third number between 1 and 50");
        val3 = scan.nextInt();
        
        System.out.println("Enter fourth number between 1 and 50");
        val4 = scan.nextInt();
        
        System.out.println("Enter fifth number between 1 and 50");
        val5 = scan.nextInt();
        
        int[] valArr = {val1, val2, val3, val4, val5};
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < valArr[i]; j++){
                System.out.print("O");
            }
            System.out.println();
        }
    }
}









































































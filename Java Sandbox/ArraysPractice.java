import java.util.Scanner;
public class ArraysPractice
{
    private static Scanner scan = new Scanner (System.in);
    public static void arrayAdder () {
        // Declare my array and necessary variables
        int[] values;
        int numberOfValues, sum = 0;
        // Ask the user how many values?
        System.out.println("How many values?");
        numberOfValues = scan.nextInt();
        
        // Initialize the array to the user's chosen size
        values = new int[numberOfValues];
        
        for (int i = 0; i < values.length; i++){
            System.out.println("Enter value " + i);
            values[i] = scan.nextInt();
        }
        
        // Loop to add and display values:
        for (int i = 0; i < values.length; i++){
            sum += values[i]; // add to our sum
            System.out.print(values[i] + " "); // Display value + a space
            if (i == values.length - 1){ // last value?
                System.out.print ("= ");
            } else {
                System.out.print ("+ ");
            }
        }
        
        //Find the lowest value
        int min = values[0];
        for (int i = 0; i < values.length; i++){
            if (values[i]<min){
                min = values[i];
            }
        }
        
        //Find the largest value
        int max = values[0];
        for (int i = 0; i < values.length; i++){
            if (values[i]>max){
                max = values[i];
            }
        }
        
        //Find the average
        double avg = (double)sum/values.length;
        
        // Output the final sum to complete the line
        System.out.println (sum);
        System.out.println ("Smallest value is " + min + " and the largest value is " + max);
        System.out.println ("The average of all values is " + avg);
    }
    
    public static void diceRoller(){
        int rolls, sides, numOfDie;
        int[] values;
        int[] occurences;
        System.out.println("How many rolls should be performed?");
        rolls = scan.nextInt();
        System.out.println("How many sides do you want your dice to have?");
        sides = scan.nextInt();
        System.out.println("How many die do you want to roll?");
        numOfDie = scan.nextInt();
        values = new int[rolls];
        occurences = new int[(sides*numOfDie)+1];
        
        //gather the roll values
        for (int i = 0; i < rolls; i++){
            values[i] = rollDice(sides, numOfDie);
            //Add 1 to the coresponding number to track how many occurences it has
            occurences[values[i]]++;
        }
        
        //Display all the roll values
        for (int i = 0; i < rolls; i++){
            System.out.println("Roll " + (i+1) + " = " + values[i]);
        }
        
        //Determine Percentage
        for (int i = numOfDie; i < (sides*numOfDie)+1; i++){
            //Find out the percentage
            double percentage = occurences[i]*100.0 / rolls;
            //Round to one decimal
            percentage = Math.round(percentage*10.0)/10.0;
            System.out.println("Percentage of " + i + " is " + percentage + "%");
        }
    }
    
    //Create a seperate method for rolling the dice
    public static int rollDice(int sides, int numOfDie){
        int sum = 0;
        for (int i = 0; i < numOfDie; i++){
            sum = sum + ((int)(Math.random() * sides) + 1);
        }
        return sum;
    }
}

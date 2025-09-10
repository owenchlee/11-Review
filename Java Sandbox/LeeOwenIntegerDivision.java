import java.util.Scanner;

public class LeeOwenIntegerDivision
{
    private static Scanner scan = new Scanner (System.in);
    public static void main (String[] args){
        
    }
    
    public static double findSpeed(){
        double distance, hours;
        System.out.println("What is your distance?");
        distance = scan.nextDouble();
        System.out.println("How many hours did you travel?");
        hours = scan.nextDouble();
        if (hours == 0){
            return Double.NaN;
        }
        return distance/hours;
    }
    
    public static void numOfGroups(int students){
        System.out.println(students/4 + " group(s) and " + students%4 + " left over");
    }
}
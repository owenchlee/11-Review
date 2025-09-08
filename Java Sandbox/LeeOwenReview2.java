public class LeeOwenReview2
{
    public static void main(String[] args) {
        reverse("Hi");
    }
    
    public static void reverse (String str){
        String reversed = "";
        for (int i = str.length(); i > 0; i--){
            reversed = reversed + str.charAt(i-1);
        }
        System.out.println(reversed);
        
    }
    
    public static String reverseReturn (String str){
        String reversed = "";
        for (int i = str.length(); i > 0; i--){
            reversed = reversed + str.charAt(i-1);
        }
        return reversed;
        
    }
    
    public static void calculateRect (int length, int width){
        int perimeter = 2*(length + width);
        int area = length*width;
        System.out.println("Area is " + area + ", and the Perimeter is " + perimeter);
    }
    
    public static String repeatChar (char character, int times){
        String finalChar = "";
        for (int i = 0; i < times; i++){
            finalChar = finalChar + character;
        }
        return finalChar;
    }
}
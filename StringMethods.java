import java.util.Scanner;
public class StringMethods{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
         String str=sc.nextLine();
         System.out.println("length: " + str.length());
         System.out.println("first character: " + str.charAt(0));
         System.out.println("Uppercase: " + str.toUpperCase());
         System.out.println("lowercase: " + str.toLowerCase());
         System.out.println("text equals: " + str.equals("java"));
         System.out.println("index: " + str.indexOf("a"));
    }
}
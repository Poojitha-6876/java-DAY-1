import java.util.Scanner;
public class PositiveNumber{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a value:");
        int a=sc.nextInt();
        if(a>0){
            System.out.println("the given number is positive");
        }
            else{
                System.out.println("the give number is not positive ");
            }
        
    }
}
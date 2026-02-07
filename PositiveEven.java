import java.util.Scanner;
public class PositiveEven{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a value:");
        int a=sc.nextInt();
        if(a%2==0&&a>0){
            System.out.println("the given number is positiveEven");
        }
            else{
                System.out.println("the give number is not positiveEven ");
            }
        
    }
}
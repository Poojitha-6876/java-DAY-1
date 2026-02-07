import java.util.Scanner;
public class AssignementOperator{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a value:");
        int a=sc.nextInt();
        System.out.println("enter b value:");
        int b=sc.nextInt();
        System.out.println("addition:"+(a+=b));
        System.out.println("subtraction:"+(a-=b));
        System.out.println("multiplication:"+(a*=b));
        System.out.println("Division:"+(a/=b));
        System.out.println("modules:"+(a%=b));
}
}
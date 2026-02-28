import java.util.*;
class SumOfArrayUsingScanner{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int arr[]=new int[4];
        System.out.println("Enter Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");
            for(int j=0;j<arr.length;j++)
            {
                System.out.println(arr[j]);
                 }
                 int sum=0;
                 sum = sum + arr[i];
                 System.out.println("sum: " + sum);
        }
    }

public class SwapTemp{
    public static void main(String args[]){
        int x=50;
        int y=60;
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("x:"+x);
        System.out.println("y:"+y);
    }
}
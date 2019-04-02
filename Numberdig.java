import java.util.Scanner;
public class Numberdigits{
    public static void main(String args[]){
        int count = 0, n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        System.out.println("Enter The Values :" +n);
        while(n!= 0)
        {
            n/= 10;
            ++count;
        }
        System.out.println("Number of digits: " + count);
    }
}

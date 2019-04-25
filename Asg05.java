import java.io.*;
import java.util.*;
class Asg05 {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        while(sc.hasNextInt()) {
            n = sc.nextInt();
            sum=sum+n;
        }
        System.out.println("Sum of the Numbers is:"+sum);
    }
}
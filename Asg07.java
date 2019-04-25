import java.io.*;
import java.util.*;
class Asg07 {
    public static void main(String[] args) {
        int mod, i = 0, c = 0,n=0,temp,sum=0;
        int a[] = new int[15];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        n=sc.nextInt();
            while (n >= 1) {
                mod = n % 10;
                a[i] = mod;
                n = n / 10;
                c++;
                i++;
            }
            for (i = 0; i < c; i++) {
                for (int j = 0; j < c; j++) {
                    if (a[j] < a[j + 1]) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
            System.out.print("Sorted in non-increasing order: ");
            for (i = 0; i < c; i++) {
                System.out.print(a[i]);
                if (a[i] % 2 == 0)
                    sum = sum + a[i];
            }
            System.out.println("");
            System.out.println("Sum of even numbers = " + sum);
            if (sum >= 15)
                System.out.println("True");
            else
                System.out.println("False");
    }
}
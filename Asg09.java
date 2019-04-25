import java.io.*;
import java.util.*;
import java.lang.*;
class Asg09 {
    void reverse(String s) {
        int n;
        char a[]=new char[30];
        System.out.print("The reversed String is: ");
        n=s.length();
        for (int i = 0; i < n; i++) {
            a[i]=s.charAt(i);
            System.out.print(a[n-i-1]);
        }

    }

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        s = sc.nextLine();
        Asg09 q = new Asg09();
        q.reverse(s);


    }
}
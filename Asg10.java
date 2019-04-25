import java.io.*;
import java.util.*;
import java.lang.*;
class Asg10 {
    public static void main(String[] args){
        String s,a;
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        s=sc.nextLine();
        System.out .println("Enter the value: ");
        n=sc.nextInt();
        i=s.length()-n;
        a=s.substring(i);
        for(int j=1;j<=n;j++){
            s=s.concat(a);
        }
     System.out.println("Output: "+s);
    }
}
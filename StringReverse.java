import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        //need to know what each of these means and does and how they work together
        String B= new StringBuilder(A).reverse().toString();

        if(A.equals(B)) System.out.println("Yes");
        else System.out.println("No");
        
        
    }
}




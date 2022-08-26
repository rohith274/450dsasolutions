/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int len = sc.nextInt();
            long a[] = new long[len];
            for (int i = 0; i < len; i++) {
                a[i] = sc.nextLong();
            }
            for (int i = len - 1; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }
            System.out.println();

        }
        // code
    }
}
// link:
// https://practice.geeksforgeeks.org/viewSol.php?subId=ff301c024361d20c3842168b4efda7d2&pid=78&user=rohithstudentindia
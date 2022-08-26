// https://practice.geeksforgeeks.org/viewSol.php?subId=735191905de9f3a1764d5dfecc385565&pid=703457&user=rohithstudentindia

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class pair {
    long first, second;

    public pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int) (n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }

            Compute obj = new Compute();
            pair product = obj.getMinMax(a, n);
            System.out.println(product.first + " " + product.second);

        }
    }
}

// } Driver Code Ends

// User function Template for Java

/*
 * class pair
 * {
 * long first, second;
 * public pair(long first, long second)
 * {
 * this.first = first;
 * this.second = second;
 * }
 * }
 */

class Compute {
    static pair getMinMax(long a[], long n) {

        pair hello = new pair(a[0], a[0]);

        // Write your code here
        for (int i = 0; i < n; i++) {
            if (a[i] > hello.second) {
                hello.second = a[i];
            }
            if (a[i] < hello.first) {
                hello.first = a[i];
            }
        }

        return hello;

    }

}

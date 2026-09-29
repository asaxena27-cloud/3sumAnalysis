import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import edu.princeton.cs.algs4.In;


public class ThreeSum {

    // Count triples that sum to 0 (brute force O(n^3))
    public static int count(int[] a) {

        int count = 0;
        int n= a.length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; i<j; j++)
            {
                for(int k=0; i<k; k++)
                {
                    if( a[i]+a[j]+a[k] ==0)
                    {
                        count++;
                    }
                }
            }
        }
        //TODO: Finish THreeSum

        return count;
    }

    public static void main(String[] args) throws IOException {
        In in = new In(args[0]);
        int[] a = in.readAllInts();


        // Time only the count() call
        Stopwatch timer = new Stopwatch();
        int count = count(a);
        double time = timer.elapsedTime();

        System.out.printf("Count = %d  time = %.3f seconds%n", count, time);
    }
}

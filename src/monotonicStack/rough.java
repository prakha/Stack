package monotonicStack;

import java.util.*;

public class rough {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        int[] arr = {2, 3};
        int n = arr.length;
        int[] a = count(arr, n);
        System.out.println(Arrays.toString(a));
    }

    static int[] count(int[] arr, int N){

        for (int i = 0; i < N; i++){

           arr[i]--;
        }
        return arr;
    }
}

package CsesProblemSet;

import java.util.Scanner;

public class weirdAlgorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    static void print(int n){
        int temp = n;
        System.out.print(temp + " ");

        while(temp > 1){
            if(temp%2== 0){
                temp = temp /2;
                System.out.print(temp + " ");

            }
            else{
                temp = temp*3 + 1;
                System.out.print(temp + " ");
            }
        }
    }
}

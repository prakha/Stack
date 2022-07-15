package monotonicStack;

import java.util.HashMap;
import java.util.Stack;
import java.util.Vector;
import java.util.Map;
import java.util.*;

public class stockSpanProblem {

    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};

        stockSpan(arr);
    }

    static void stockSpan(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        Vector<Integer> vector = new Vector<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i= 0; i < arr.length; i++){
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (stack.size() == 0) {
                vector.add(-1);
            } else if (stack.size() > 0 && stack.peek() > arr[i]) {
                vector.add(map.get(stack.peek()));
            } else if (stack.size() > 0 && stack.peek() <= arr[i]) {
                while (stack.size() > 0 && stack.peek() <= arr[i]) {
                    stack.pop();
                }
                if (stack.size() == 0) {
                    vector.add(-1);
                } else {
                    vector.add(map.get(stack.peek()));
                }
            }
            stack.push(arr[i]);
        }

        for (int i = 0; i < vector.size(); i++) {
            if(i == -1){
                System.out.print(1);
            }
            System.out.print(i - vector.get(i)+ " ");
        }
    }
}

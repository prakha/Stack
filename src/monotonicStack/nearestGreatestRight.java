package monotonicStack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

import java.util.*;

public class nearestGreatestRight {

    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 10};
        nextGreaterToRight(arr);
    }
    static void nextGreaterToRight(int[] arr){
        Stack<Integer> st = new Stack<>();
        //Vector<Integer> v = new Vector<>();
        List<Integer> canSee = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0 ; i--) {
            int count1 = 0;
            if(st.size() == 0){
                //v.add(-1);
                canSee.add(count1);
            }
            else if(st.size() > 0 && st.peek() > arr[i]){
                //v.add(st.peek());
                count1++;
                canSee.add(count1);
            }
            else if(st.size() > 0 && st.peek() <= arr[i]){
                int count = 0;
                while(st.size() > 0 && st.peek() <= arr[i]){
                    count++;
                    st.pop();
                }
                if(st.size() == 0){
                    //v.add(-1);
                }
                else{
                    count++;
                    //v.add(st.peek());
                }
                canSee.add(count);
            }
            st.push(arr[i]);
        }
        Collections.reverse(canSee);

        System.out.println(canSee);
    }

}

package monotonicStack;
import java.util.Stack;
import java.util.*;

public class nearestSmallestToLeft {
    public static void main(String[] args) {
        int[] arr = {0 ,9, 13, 10, 1, 2, 41};
        nsl(arr);
    }
    static void nsl(int[] arr){
        Stack<Integer> st = new Stack<>();
        Vector<Integer> v = new Vector<>();

        for (int i = 0; i < arr.length ; i++) {
            if(st.size() == 0){
                v.add(-1);
            }
            else if(st.size() > 0 && st.peek() < arr[i]){
                v.add(st.peek());
            }
            else if(st.size() > 0 && st.peek() >= arr[i]){
                while(st.size() > 0 && st.peek() >=arr[i]){
                    st.pop();
                }
                if(st.size() == 0){
                    v.add(-1);
                }
                else{
                    v.add(st.peek());
                }
            }
            st.push(arr[i]);
        }
        System.out.println(v);
    }
}

package codechef;
import java.util.ArrayList;
import java.util.List;

public class makethemEqual {

    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 1;
        boolean ans = canBeEqual(a, b, c);
        System.out.println(ans);
    }

    static boolean canBeEqual(int a , int b, int c){
        List<Integer> list = findMax(a, b, c);
        list = findMax(a, b, c);
        int count = 0;

        for(int i = list.size() - 1; i > 0; i--){
            int temp = list.get(i);
            if(temp == list.get(0)){
                count++;
            }
            else {
                int k = 1;
                while (temp<list.get(0)){
                    temp += Math.pow(2, k-1);
                    i++;
                    if(temp == list.get(0)){
                        count++;
                    }
                    if(temp > list.get(0)){
                        break;
                    }
                }
            }

        }

        if(count == 2){
            return true;
        }

        return false;

    }

    static List<Integer> findMax(int a, int b, int c){
        List<Integer> list = new ArrayList<>();

        if(a>=b && b>=c){
            list.add(a);
            list.add(b);
            list.add(c);
        }

        else if(b>=a && b>= c){
            list.add(b);
            list.add(a);
            list.add(c);
        }
        else if(c>=a && c>=b){
            list.add(c);
            list.add(a);
            list.add(b);
        }

        return list;



    }
}

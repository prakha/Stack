package codechef;

public class burgers {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int ans = noOfBurgers(a, b);
        System.out.println(ans);

    }

    static int noOfBurgers(int a, int b){
        int count = 0;
        if(a == b){
            return a;
        }

        if(b > a){
            while(a>0){
                count++;
                a--;

            }
            return count;
        }

        if (a>b){
            while(b>0)
            {
                count++;
                b--;
            }
            return count;
        }
        return -1;
    }
}

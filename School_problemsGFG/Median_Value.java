package School_problemsGFG;
import java.util.Arrays;

public class Median_Value {
    public static void main(String[] args) {

        int[] V = {56, 67 ,30 ,79};
        System.out.println(median(V));
    }

    public static int median(int[] V) {
        int mid;
        Arrays.sort(V);
        int N=V.length;
        if(N%2==0){
            mid=N/2;
            return ((V[mid]+ V[mid-1])/2);
        }else {

            mid=N/2;
            return V[mid];
        }

    }
}
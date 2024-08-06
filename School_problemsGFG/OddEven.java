package School_problemsGFG;

public class OddEven {
    public static void main(String[] args) {
        int n=18;
        System.out.println(oddeven(n));
    }
    public static boolean oddeven(int n){
        return ((n&1)==1); //checking its odd or even
    }
}

package School_problemsGFG;

public class reverseDigit {
    public static void main(String[] args) {
        long N=200;
        long out=reverse(N);
        System.out.println(out);
    }
    public static long reverse(long N){
        long rev=0;
        while(N>0){
            rev=rev*10 + N%10;
            N=N/10;
        }
        return rev;
    }
}

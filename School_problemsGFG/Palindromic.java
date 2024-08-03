package School_problemsGFG;

public class Palindromic {
    public static void main(String[] args) {
        int n=555;
        String ex=palindromic(n);
        System.out.println(ex);
    }
    public static String palindromic(int n){
        int copy=n;
        int rev=0;
        while(n>0){
            rev=rev*10 + n%10;
            n=n/10;
        }
        if(copy!=rev){
            return "No";
        }
           else{
               return "Yes";
        }
    }
}

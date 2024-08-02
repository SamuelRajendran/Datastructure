package School_problemsGFG;

public class PatternGFG {
    public static void main(String[] args) {
        int n=3;
        int count=n,temp=n;
        while(n>0){
            count=temp;
            while (count>0){
                for(int i=0;i<n;i++){
                    System.out.print(count + " ");
                }
                count--;
            }
            System.out.print(" $");
            n--;
        }
    }
}
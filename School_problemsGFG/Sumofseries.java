package School_problemsGFG;

public class Sumofseries {
    public static void main(String[] args) {
        long ans=Sumofseries(1147896578);
        System.out.println(ans);

    }
    public static long Sumofseries(int n){
   //sumofseries formula for sum of naturalnumber n*(n+1)/2
        //also we are type converting
    return (long)n*(n+1)/2;

    }

}


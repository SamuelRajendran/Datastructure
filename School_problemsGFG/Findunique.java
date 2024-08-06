package School_problemsGFG;

public class Findunique {
    public static void main(String[] args) {
        int [] arr={2,3,3,1,2,1,6};

        System.out.println(unique(arr));
    }
    public static int unique(int[]arr){
        int Unique=0;
        for(int n :arr)
         Unique ^=n; //here this will do add and sub
        return Unique;
    }

}

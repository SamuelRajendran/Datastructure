package School_problemsGFG;

public class SumofArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 8, 9};
      int ans=  sumofarray(arr);
        System.out.println(ans);
    }
    public static int sumofarray(int []arr){
        int tot=0;
        for (int i = 0; i < arr.length; i++) {
            tot +=arr[i];

        }return tot;
    }

}

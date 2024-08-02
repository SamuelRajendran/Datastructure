package School_problemsGFG;

public class PalindromicArray {
    public static void main(String[] args) {
        int arr[]={111,222,333,254};
        System.out.println(palindromic(arr));
    }
    public static boolean palindromic(int[] arr){
        for(int i=0;i<arr.length;i++){
            int copy=arr[i];
            int rev=0;
            while(arr[i]>0){
                rev=rev*10 + arr[i]%10;
                arr[i]=arr[i]/10;
            }
            if(copy!=rev)
                return false;
        }
        return true;
    }
}

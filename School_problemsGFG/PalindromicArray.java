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

/*Algo

-->loop
-->single element copy
-->variable declare to reversed item to store
-->while to check the current item
-->reverse mrthod rev*10 + arr[I]%10-->to take last element
-->to cut the value of element by using element/10;
-->check by if statement copy element and reversed element I  same  true or not

*/

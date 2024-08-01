package School_problemsGFG;

public class PrintNwithoutloop {
    public static void main(String[] args) {
        Withoutloop(10);
    }
    public static void Withoutloop(int N){
        if(N==0)
            return;
        else {
            Withoutloop(N-1);
            System.out.println(N + " ");
        }
    }
}

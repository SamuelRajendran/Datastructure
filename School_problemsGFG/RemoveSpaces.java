package School_problemsGFG;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str= "Samuel    Rasitha ";
        System.out.println(removespaces(str));
    }
    public static String removespaces(String str){

       String str1=str.replaceAll(" ","");
        return str1;
    }
}

package School_problemsGFG;

public class Gcd {
    public static void main(String[] args) {
        int a = 3, b = 6;
        int delvi = gcd(a, b);
        System.out.println(delvi);

    }

    public static int gcd(int a, int b) {
        int rem = 1;
        int divd;
        int divs;
        if (a > b) {
            divd = a;
            divs = b;
        } else {
            divd = b;
            divs = a;
        }
        while (rem != 0) {
            rem = divd % divs;
            if (rem != 0) {
                divd = divs;
                divs = rem;
            }

        }
        return divs;
    }
}
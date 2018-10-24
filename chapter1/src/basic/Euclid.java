package basic;

public class Euclid {
    public static void main(String[] args) {
        System.out.println("GCD = " + gcd(100, 5));
    }

    public static int gcd(int p, int q) {
		System.out.println("p: " + p + " q: " + q);
        if (q==0) return p;
        int r = p % q;
        return gcd(p, r);
    }
}
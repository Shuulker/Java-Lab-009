import java.math.BigInteger;

public class BigIntRewrite {
    public static void main(String[] args) {
        System.out.println(pow(1000,40));
    }

    public static BigInteger pow(int x, int n) {
        if (n == 0) return BigInteger.valueOf(1);
        // find x to the n/2 recursively
        BigInteger t = pow(x, n / 2);
        BigInteger xBig = BigInteger.valueOf(x);
        // if n is even, the result is t squared
        // if n is odd, the result is t squared times x
        if (n % 2 == 0) {
            return t.multiply(t);
        } else {
            return t.multiply(t.multiply(xBig));
        }
    }
}

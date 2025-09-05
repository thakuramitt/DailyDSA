public class AliceBobFlowers {
    public static long solve(int m, int n) {
        long evenM = m / 2;
        long oddM = (m+1) / 2;
        long evenN = n / 2;
        long oddN = (n+1) / 2;

        return evenM * oddN + evenN * oddM;

    }

    public static void main(String[] args) {

        int m = 3;
        int n = 2;

        long ans = solve(m, n);
        System.out.println(ans);
    }
}

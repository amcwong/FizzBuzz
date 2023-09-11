public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int step = 1;

        while (n > 0){
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
            step++;
    //        System.out.println(step);
            System.out.println(n);
        }

    }
}

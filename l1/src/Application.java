import java.io.File;

public class Application {

    public static void main(String[] args) {
        int[] b = {1,2,4,5,6,7};
        System.out.println(divide(b, 7));
    }

    public static int divide(int[] a, int min) {
        if (a.length < min) {
            return -1;
        }
        return a.length;
    }
}

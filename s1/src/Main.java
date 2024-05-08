import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FindElement findElement = new FindElement();
        int[] arr = {1, 2, 3, 4, 5, 6};
        Scanner scanner = new Scanner(System.in);
        int findEl = scanner.nextInt();
        System.out.println(findElement.findElement(arr, null));
    }
}
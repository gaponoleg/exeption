import java.util.ArrayList;
import java.util.Scanner;

public class View {
    Scanner scanner;
    String[] array;

    public View(){
        scanner = new Scanner(System.in);
        array = new String[5];
    }

    public String parse(){
        System.out.println("Введите информацию:");
        String info = scanner.nextLine();
        return info;
    }
}

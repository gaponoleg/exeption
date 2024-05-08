import java.util.Arrays;

import static java.lang.System.exit;

public class Main {
    static View view;

    public static void main(String[] args) {
        view = new View();
        Model model = new Model();
        String result = view.parse();
        String[] arr = model.crash(result);
        try{
            model.problem(arr);
        }catch (Exception e){
            System.out.println("Указано не достаточное количество данных");
            System.exit(0);
        }
        model.writer(arr[0], arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(model.newForm(arr)));
    }


}
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Model {
    public String[] crash(String info){
        String[] arr = info.split(" ");
        return arr;
    }

    public void problem(String[] arr){
        if (arr.length != 6){
            throw new RuntimeException();
        }
    }

    public Object[] newForm(String[] arr){
        Object[] array = new Object[6];
        int countName = 0;
        for (int i = 0; i < arr.length; i++) {
             if (arr[i].contains(".")){
                array[4]= arr[i];
            } else if (Objects.equals(arr[i], "f") || Objects.equals(arr[i], "m")){
                array[5] = arr[i];
            } else {
                array[countName++] = arr[i];
            }try{
                int numberPhone = Integer.parseInt(arr[i]);
                array[3]=numberPhone;
            } catch (NumberFormatException ignored){
            }
        }
        return array;
    }

    public void writer(Object fileName, Object[] info) {
        try (FileWriter writer = new FileWriter( fileName + ".txt", true)) {
            for (int i = 0; i < info.length; i++) {
                writer.write("<");
                writer.write((String) info[i]);
                writer.write(">");
            }
            writer.append("\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

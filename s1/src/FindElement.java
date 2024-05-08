public class FindElement<T> {
    public int findElement(int[] arr, int element){
        if (arr == null){
            return -3;
        }
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == element){
                return i+1;
            }
        }
        return -2;
    }
}

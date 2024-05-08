public class Main {
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 0},
                {1, 0, 1},
                {0, 1, 0}};

        System.out.println(sumArr(arr));
    }

    public static int sumArr(int[][] arr){
        int sum = 0;
        for (int[] row: arr) {
            if (row.length != arr.length) {
                throw new RuntimeException("Массив не квадратный");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
                if (arr[i] [j] != 1 && arr[i] [j] != 0){
                    throw new RuntimeException("Элемент не равняется 0 или 1");
                }
            }
        }
        return sum;
    }
}
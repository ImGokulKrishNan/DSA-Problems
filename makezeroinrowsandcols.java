import java.util.Arrays;

public class makezeroscolsrows {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {0, 8, 7},
                {9, 8, 0},
        };
        int row = arr.length - 1;
        int col = arr[0].length - 1;

        zero(arr, row, col);
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(Arrays.toString(arr[i]) + " ");
        }
    }

    static int[][] zero(int[][] arr, int row, int col) {

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                if (arr[i][j] == 0) {
                    makezeros(arr, i, j);
                }

            }
        }
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }

            }

        }
    }
}

import java.io.*;
import java.util.*;

public class HourGlassSum {

     // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        ArrayList al = new ArrayList();
        for( int r = 0; r < arr.length - 2; r++) {
            for(int c = 1; c < arr[0].length - 1; c++) {
                int h = arr[r][c-1]+ arr[r][c]+ arr[r][c+1] + arr[r + 1][c]
                    +  arr[r+2][c-1]+ arr[r+2][c]+ arr[r +2][c+1] ;
                al.add(h);
            }
        }
        Collections.sort(al);
        System.out.print(al);
        return (int) al.get(al.size() - 1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
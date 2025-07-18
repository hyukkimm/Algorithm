import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                String Char = str.substring(j, j + 1);
                if (Char.equals("W")) {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }

            }
        }

    }

}

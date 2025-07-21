import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] chess = new String[N];

        for(int i = 0; i < N; i++){
            chess[i] = br.readLine();
        }
        int count = 64;
        for(int i = 0; i <= N-8; i++){
            for(int j = 0; j <= M-8; j++){
                int resultCount = getCount(i, j, chess);
                if(count > resultCount){
                    count = resultCount;
                }
            }
        }
        System.out.println(count);
    }
    public static int getCount(int N, int M, String[] chess) {
        String White = "WBWBWBWB";
        String Black = "BWBWBWBW";
        int whiteStartCount = 0;
        int blackStartCount = 0;
        for(int i = 0; i < 8; i++){ 
            int row = N + i;
            for(int j = 0; j < 8; j++){ 
                int col = M + j;
                if(i%2==0){
                    if(chess[row].charAt(col) != White.charAt(j)){
                        whiteStartCount++;
                    }
                    if(chess[row].charAt(col) != Black.charAt(j)){
                        blackStartCount++;
                    }
                }
                else{
                    if(chess[row].charAt(col) != Black.charAt(j)){
                        whiteStartCount++;
                    }
                    if(chess[row].charAt(col) != White.charAt(j)){
                        blackStartCount++;
                    }
                }
            }
        }
        return Math.min(whiteStartCount, blackStartCount);

    }
}

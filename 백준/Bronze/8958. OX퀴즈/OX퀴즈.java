import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] scores = new int[N];

        for (int i = 0; i < N; i++) {
            int combo = 1;
            String OX = br.readLine();
            for(int j=0;j<OX.length();j++){
                if(OX.charAt(j)=='O'){
                    scores[i] += combo;
                    combo++;
                }
                else{
                    combo = 1;
                }
            }
        }
        for(int score : scores){
            System.out.println(score);
        }
    }
}

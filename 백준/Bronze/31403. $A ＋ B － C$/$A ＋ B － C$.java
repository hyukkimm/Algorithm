import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        System.out.println(A+B-C);
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        sb.append(B);
        int ab = Integer.parseInt(sb.toString());
        System.out.println(ab-C);
    }
}

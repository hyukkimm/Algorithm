import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        Integer arr[] = new Integer[N.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(N.charAt(i)));
        }
        Arrays.sort(arr,Collections.reverseOrder());
        for(int num : arr){
            System.out.print(num);
        }

    }
}

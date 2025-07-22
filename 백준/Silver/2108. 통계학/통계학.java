import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] count = new int[8001];
        int total = 0;
        int[] mode = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            total += arr[i];
            count[arr[i] + 4000]++;
        }
        Arrays.sort(arr);
        int avg = (int) Math.round((double) total / N);
        int mid = arr[N/2];
        int range = arr[N-1]-arr[0];
        int Freq = 0;
        for (int c : count) {
            if (c > Freq) Freq = c;
        }
        int index = 0;
        for(int i=0;i<count.length;i++){
            if(count[i]==Freq){
                mode[index++]=i-4000;
            }
        }
        Arrays.sort(mode,0,index);
        int Mode = 0;
        if(index==1){
            Mode = mode[0];
        }
        else{
            Mode = mode[1];
        }
        System.out.println(avg);
        System.out.println(mid);
        System.out.println(Mode);
        System.out.println(range);
    }
}

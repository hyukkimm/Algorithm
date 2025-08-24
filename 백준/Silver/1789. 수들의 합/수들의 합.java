import java.io.*;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        int i=0,cnt=0;
        long sum=0;
        while(true){
            i++;
            sum+=i;
            cnt++;
            if(sum==S){
                break;
            }else if(sum>S){
                cnt--;
                break;
            }
        }
        System.out.println(cnt);
    }
}

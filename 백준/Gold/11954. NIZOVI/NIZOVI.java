import java.io.*;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder jump = new StringBuilder();
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch =='{') {
                sb.append(ch);

                jump.append("  ");
                if(s.charAt(i+1)!='}'){
                    sb.append('\n');
                    sb.append(jump);
                }

            }else if (ch =='}') {
                jump.delete(jump.length()-2,jump.length());
                sb.append('\n');
                sb.append(jump);
                sb.append(ch);
            }else if (ch ==',') {
                sb.append(ch);
                sb.append('\n');
                sb.append(jump);
            }else{
                sb.append(ch);
            }
        }
        System.out.print(sb);
    }
}

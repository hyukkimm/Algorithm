import java.io.*;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            Stack<Character> stack = new Stack<>();
            String s = br.readLine();
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(') {
                    stack.push(c);
                } else {
                    stack.pop();
                    if (s.charAt(i - 1) == '(') {
                        sum += stack.size();
                    } else {
                        sum += 1;
                    }
                }
            }
        System.out.println(sum);

    }
}

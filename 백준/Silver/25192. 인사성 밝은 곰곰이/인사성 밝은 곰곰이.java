import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();

        int N = Integer.parseInt(br.readLine());
        int gomgom = 0;

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if(input.equals("ENTER")){
                gomgom+=set.size();
                set.clear();
            }
            else{
                set.add(input);
            }
        }
        gomgom += set.size();

        System.out.println(gomgom);
    }
}

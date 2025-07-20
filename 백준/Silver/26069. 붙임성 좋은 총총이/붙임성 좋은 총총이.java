import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> dancer = new HashSet<>();
        dancer.add("ChongChong");
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer human = new StringTokenizer(br.readLine()," ");
            String name1 = human.nextToken();
            String name2 = human.nextToken();
            if(dancer.contains(name1) || dancer.contains(name2)){
                dancer.add(name1);
                dancer.add(name2);
            }
        }
        System.out.println(dancer.size());
    }
}

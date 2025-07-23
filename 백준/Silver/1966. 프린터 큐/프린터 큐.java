import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static class Document{
        int index;
        int importance;
        Document(int index, int importance) {
            this.index = index;
            this.importance = importance;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine()," ");
            Queue<Document> queue = new LinkedList<>();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                int importance = Integer.parseInt(st.nextToken());
                queue.offer(new Document(j, importance));
                arr[j] = importance;
            }
            Arrays.sort(arr);
            int index = N-1;
            int count = 0;
            while (!queue.isEmpty()) {
                Document now = queue.poll();
                if (now.importance == arr[index]) {
                    count++;
                    index--;
                    if(now.index==M){
                        System.out.println(count);
                        break;
                    }
                }
                else {
                    queue.offer(now);
                }
            }
        }


    }

}

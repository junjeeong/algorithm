import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String,String> myHash = new HashMap<>();

        for(int i=0;i<N;i++){
            String[] urlAndPassword = br.readLine().split(" ");
            myHash.put(urlAndPassword[0], urlAndPassword[1]);
        }

        for(int i=0;i<M;i++){
            String searchUrl = br.readLine();
            System.out.println(myHash.get(searchUrl));
        }

    }
}

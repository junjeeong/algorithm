import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++){
            char[] temp = br.readLine().toCharArray();
            Stack<Character> myStack = new Stack<>();
            boolean isEnd = false;

            for(char now : temp){
                if(now == '('){
                    myStack.push(now);
                }else {
                    if(myStack.empty()){
                        System.out.println("NO");
                        isEnd = true;
                        break;
                    }else {
                        myStack.pop();
                    }
                }
            }
            if(!isEnd) {
                if (myStack.empty()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
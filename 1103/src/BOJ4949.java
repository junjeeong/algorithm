import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();

        while(!text.equals(".")){
            Stack<Character> stack = new Stack<>();
            boolean result = true;
            char[] textToChar = text.toCharArray();

            for(char now : textToChar){
                if(now == '('){
                    stack.push(now);
                }else if(now == '['){
                    stack.push(now);
                }else if(now == ')'){
                    if(stack.isEmpty()){
                        result = false;
                        break;
                    }
                    char check = stack.pop();
                    if(check != '(') {
                        result =false;
                        break;
                    }
                }else if(now == ']'){
                    if(stack.isEmpty()){
                        result = false;
                        break;
                    }
                    char check = stack.pop();
                    if(check != '[') {
                        result =false;
                        break;
                    }
                }
            }
            if(result && stack.isEmpty()){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
            text = br.readLine();
        }

    }
}

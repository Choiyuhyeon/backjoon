import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); 

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int i = 1;

        for (int n = d; n <= 100; n++) {
            if(a*n + b <= c*n) {
                i = 1;
            }
            else{
                i = 0; 
                break;
            }
            }
          System.out.println(i);
        }
    }

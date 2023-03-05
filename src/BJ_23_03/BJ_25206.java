package BJ_23_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double c = 0;
        double d = 0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            st.nextToken();
            double a = Double.parseDouble(st.nextToken());
            String b = st.nextToken();

            if (b.equals("P")) {
                continue;
            }

            d += a;

            switch (b) {
                case "A+":
                    c += a * 4.5;
                    break;
                case "A0":
                    c += a * 4.0;
                    break;
                case "B+":
                    c += a * 3.5;
                    break;
                case "B0":
                    c += a * 3.0;
                    break;
                case "C+":
                    c += a * 2.5;
                    break;
                case "C0":
                    c += a * 2.0;
                    break;
                case "D+":
                    c += a * 1.5;
                    break;
                case "D0":
                    c += a;
                    break;
                case "F":
                    break;
            }
        }
        System.out.println(c/d);
    }
}

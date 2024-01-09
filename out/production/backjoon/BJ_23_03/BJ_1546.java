package BJ_23_03;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double score[] = new double[n];
        double M;
        double sum = 0;

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextDouble();
        } //값 넣기
        Arrays.sort(score);

        for(int i=0; i<score.length; i++){
            sum += score[i]/score[score.length-1]*100;
        }
        double Average = sum/score.length;

        System.out.println(Average);
    }
}
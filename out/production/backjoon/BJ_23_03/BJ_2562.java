package BJ_23_03;

import java.util.Scanner;

public class BJ_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A =new int[9];
        int max = 0;
        int index = 0;

        for(int i=0; i<9; i++){
            A[i] = sc.nextInt();
        } //배열에 값 넣기

        for(int j=0; j<9; j++) {
            if (A[j] > max) {
                max = A[j];
                index = j+1;
            }
        }

        System.out.println(max);  //배열의 크기와 인덱스는 다르다는 것 중요.!
        System.out.println(index);
    }
}

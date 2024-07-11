package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main_3273 {

    public int solution(int n, int[] arr, int x){
        int answer =0;
        int start=0, end=n-1;

        Arrays.sort(arr);

        while(start<end){
            int sum=arr[start]+arr[end];
            if(sum==x){answer++;}
            if(sum<x){start++;}
            else{end--;}

        }

        return answer;
    }

    public static void main(String[] args) {
        Main_3273 m = new Main_3273();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(m.solution(n, arr, x));
    }
}

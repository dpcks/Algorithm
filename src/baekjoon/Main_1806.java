package baekjoon;

import java.util.Scanner;

public class Main_1806 {

    public int solution(int n, int s, int[] arr) {
        int answer = Integer.MAX_VALUE;
        int start=0, end=0;
        int len =0;
        int sum=0;

        while(end<=n){
            if(sum>=s){
                sum-=arr[start++];
                len = end-start+1;
                if(answer>len)answer=len;

            }else if(sum<s){
                sum+=arr[end++];
            }
        }
        answer= answer==Integer.MAX_VALUE?0:answer;
        return answer;
    }

    public static void main(String[] args) {
        Main_1806 m = new Main_1806();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println(m.solution(n,s,arr));
    }
}

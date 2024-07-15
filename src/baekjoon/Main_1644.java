package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_1644 {

    public int solution(int n) {
        int answer =0;

        //소수구하기
        boolean[] prime = new boolean[n+1];
        List<Integer> arr = new ArrayList<>();
        prime[0]=prime[1]=true;
        for(int i=2;i*i<=n;i++) {
            if(!prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }
        for(int i=1; i<=n; i++){
            if(!prime[i]) {
                arr.add(i);
            }
        }

        //부분합구하기
        int start=0, end=0, sum=0;
        while(true){
            if(sum>n){
                sum-=arr.get(start++);
            }else if(end==arr.size()){
                break;
            }else{
                sum+=arr.get(end++);
            }
            if(sum==n){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_1644 m = new Main_1644();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(m.solution(n));
    }
}

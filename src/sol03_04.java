import java.util.Scanner;

public class sol03_04 {

    public int solution(int n, int m, int[] arr){
        int answer=0;
        int start=0, end=0;
        int sum=0;

        while(end<=n){
            if(sum>=m){
                sum-=arr[start++];
            }else{
                sum+=arr[end++];
            }
            if(sum==m){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        sol03_04 s = new sol03_04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(s.solution(n, m, arr));
    }
}

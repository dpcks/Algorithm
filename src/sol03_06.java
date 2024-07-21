import java.util.Scanner;

public class sol03_06 {

    public int solution(int n, int k, int[] arr) {
        int answer =0;
        int start=0,  cnt=0;

        for(int end=0; end<n; end++){
            if(arr[end]==0)cnt++;
            while(cnt>k){
                if(arr[start]==0)cnt--;
                start++;
            }
            answer = Math.max(answer,end-start+1);
        }


        return answer;
    }

    public static void main(String[] args) {
        sol03_06 m = new sol03_06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(m.solution(n, k, arr));
    }
}

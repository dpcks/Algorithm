import java.util.Scanner;

public class sol02_07_teacher {

    public int solution (int[] arr){
        int answer = 0, cnt =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                cnt++;
                answer+=cnt;
            }else{
                cnt=0;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        sol02_07_teacher s = new sol02_07_teacher();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(s.solution(arr));
    }
}

import java.util.Scanner;

public class sol02_07 {

    public int solution (int[] arr){
        int answer = 0;
        int[] score = new int[arr.length];

        if(arr[0]==1){
            score[0] = 1;
        }else{
            score[0] = 0;
        }

        for(int i=1; i<arr.length; i++){
            if(arr[i]==1 && arr[i-1]==1){
                score[i] = score[i-1]+1;
            }else if(arr[i]==1 && arr[i-1]==0){
                score[i] = 1;
            }else{
                score[i] = 0;
            }
        }
        for(int i=0; i<score.length; i++){
            answer+=score[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        sol02_07 s = new sol02_07();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(s.solution(arr));
    }
}

import java.util.Scanner;

public class sol02_11 {
    public int solution (int n, int[][]arr){
        int answer = 0;
        int max = 0;
        for(int i=1;i<=n;i++){
            int cnt = 0;
            for(int j=1;j<=n;j++){
                for(int k=1;k<=5;k++) {
                    if(arr[i][k]==arr[j][k]){
                        cnt++;
                        break;
//                        System.out.println("i= "+i+" k= "+k+" j= "+j);
//                        System.out.println("arr[i][j]= "+arr[i][j]+" arr[k][j]="+arr[k][j]);
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        sol02_11 sol = new sol02_11();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < 6; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println(sol.solution(n, arr));
    }
}

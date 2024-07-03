import javax.xml.transform.Source;
import java.util.Scanner;

public class sol02_12 {

    public int solution(int n, int m, int[][] arr) {
        int answer =0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.println("i => "+i+" j => "+j);
                int cnt =0;
                for(int k=0; k<m; k++){
                    System.out.printf("k의 %d번째 배열시작 ---------------------------------------------",k);
                    System.out.println();
                    int pi=0, pj=0;
                    for(int l=0; l<n; l++){
                        System.out.println("k=> "+k+" l=> "+l);
                        if(arr[k][l]==i){
                            System.out.printf("i인 %d 랑 같은거 발견!!!!",i);
                            System.out.println();
                            pi=l;
                            System.out.println("pi => "+pi);
                        }
                        if(arr[k][l]==j){
                            System.out.printf("j인 %d 랑 같은거 발견!!!!",j);
                            System.out.println();
                            pj=l;
                            System.out.println("pj => "+pj);
                        }
                    }
                    if(pi<pj)cnt++;
                    System.out.println("l배열 끝남 --->");
                    System.out.println("cnt => "+cnt);
                }
                if(cnt==m)answer++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        sol02_12 sol = new sol02_12();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(sol.solution(n,m,arr));
    }
}

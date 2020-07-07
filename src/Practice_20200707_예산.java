import java.util.Arrays;

public class Practice_20200707_예산 {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int data=0;
        Arrays.sort(d);
        for(int i=0;i<d.length;i++){
            data += d[i];
            if(data <= budget){
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int result1 =solution(new int[]{1,3,2,5,4},9);
        System.out.println(result1);
    }
}


import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice_20200629_구명보트 {
    public static void main(String[] args) {
      //int result1 = solution(new int[]{40, 40, 80},160);
      int result2 = solution(new int[]{70, 80, 50},100);
  //    int result3 = solution(new int[]{40, 80, 45,90},100);
    }


    public static int solution(int[] people, int limit) {
        int answer = 0;
        int i = 0;
        int j;

        Arrays.sort(people);

        // 몸무게가 가장 무거운 사람부터 판단한다.
        for(j=people.length-1; i<=j; j--) {
            if(people[j] + people[i] > limit)
                answer ++;
            else {
                answer ++;
                i ++;
            }
        }
        System.out.println(answer);
        return answer;
    }
    public static int solution1(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        int temp = people[0];
        answer++;
        for(int i=1;i<people.length;i++){
            if(limit - temp <= people[i]){
                if(limit - temp == people[i] && i !=(people.length-1)){
                    temp = people[(i+1)];
                    i++;
                }else{
                    temp = people[i];
                }
                answer++;
            }else{
                temp = temp + people[i];
            }
        }
        System.out.println(answer);
        return answer;
    }
}

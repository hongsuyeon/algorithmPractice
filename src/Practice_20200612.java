import java.util.*;
import java.util.stream.Stream;

public class Practice_20200612 {
    public static void main(String[] args) {
        String test = solution("1924", 2);  //94
        System.out.println("test===========>>>>>"+test);
         String test1 = solution("1231234", 3);  //3234
        System.out.println("test===========>>>>>"+test1);
        String test2 = solution("4177252841", 4);   //775841
        System.out.println("test===========>>>>>"+test2);
    }

    public static String solution(String number, int k) {
        String answer = "";
        char[] test = number.toCharArray();
        List<Character> test2 = new ArrayList<>();
        for(char t : test){
            test2.add(t);
        }
        char temp = 0;
        int cnt=0;
        while(cnt < k) {

            for (int i = 0; i < test2.size(); i++) {
                if (i == 0) {
                    temp = test2.get(0);
                } else {
                    System.out.println("tesmp===>"+temp+"i===============>>>"+i+"========>>"+test2.get(i));
                    if (temp < test2.get(i)) {
                        temp = test2.get(i);
                        test2.remove(0);

                    } else {
                        //temp = test2.get(i);
                 //       System.out.println("temp====>>>>" + temp);
                        System.out.println("11111111==="+i+"=== 1111111111"+test2.get(i));
                        test2.remove((i-1));

                    }
                    cnt++;

                }
            }
        }


        for(int dd=0;dd<test2.size();dd++){
            System.out.println(test2.get(dd));

        }
        return answer;
    }
}

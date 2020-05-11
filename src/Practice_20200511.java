import java.util.*;
///문자열 내림차순으로 배치하기
public class Practice_20200511 {
    public static void main(String[] args) {
        String data = solution1("Zbcdefg");
        String data2 = solution2("Zbcdefg");
        System.out.println(data);
        System.out.println(data2);
    }
    public static String solution1(String s) {
        Integer[] data = new Integer[s.length()];
       for(int i=0; i< s.length() ;i++){
           data[i] = (int) s.charAt(i);
        }
       String answer= "";
       ArrayList<Character> arr = new ArrayList();

       Arrays.stream(data).sorted(Comparator.reverseOrder()).forEach(x-> arr.add((char) (int) x));

       for(char d : arr){
           answer += d;
       }
       return answer;
    }

    public static String solution2(String s) {
     //   return Stream.of(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        char[] sol = s.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
    }
}

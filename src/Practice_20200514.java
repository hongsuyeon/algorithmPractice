public class Practice_20200514 {
    public static void main(String[] args) {
        //String result = solution("z" ,1);
        String result = solution("a B z" ,4);
        System.out.println(result);
    }
//e F d
    public static String solution(String s, int n) {
        String answer = "";
        char[] sol = s.toCharArray();
        for(char a : sol){
            System.out.println(a);
                int data = 32;
                if(((97 <= (int) a &&  (int) a <= 122)||(65 <= (int) a &&  (int) a <= 90) )/* || ((int) a > 97 && (int) a < 122))*/) {
                    if ((int) a == 122) {
                        a = 96;
                    }
                    if ((int) a == 90) {
                        a = 65;
                    }
                    data = (int) a + n;
                }
                answer+=(char) data;
           }
        return answer;
    }
}

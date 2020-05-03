//가운데 글자 가져오기
public class Practice_20200503 {
    public static void main(String[] args) {
        String s= "abcde",   answer;
        String[] array= new String[s.length()];
        for(int i=0;i<s.length();i++){
           array[i] =String.valueOf(s.charAt(i));
        }
        int modT = s.length()/2;
        if(s.length()%2==0){
            answer = array[(modT-1)]+array[(modT)];
        }else{
            answer = array[modT];
        }
        System.out.println(answer);
    }
}

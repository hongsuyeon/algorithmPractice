import java.util.*;

public class Practive_20200506 {
    public static void main(String[] args) {
      //  String[] strings = {"sun", "bed", "car"}; // 1, [car, bed, sun]
        String[] strings = {"abce", "abcd", "cdx"}; //2, [abcd, abce, cdx]
        String[] result = solution(strings, 1);
        System.out.println(Arrays.toString(result));

    }
    public static String[] solution(String[] strings, int n) {
        String[] answer = strings;
        /*
        Integer[] arrStr = new Integer[strings.length];
        int idx = 0;

        HashMap<String, Integer> tte2 = new HashMap<>();

        for(String string : strings){
            char data = string.charAt(n);
            int ialpa = (int)data;
            tte2.put(string,ialpa);
            arrStr[idx] = ialpa;
            idx++;
        }

        ArrayList<Integer> data = new ArrayList<Integer>();
        Stream.of(arrStr).sorted().forEach(x -> { //Comparator.reverseOrder()
            data.add(x);
        });

        Iterator<Map.Entry<String,Integer>> entries = tte2.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<String,Integer> entry = (Map.Entry<String,Integer>)entries.next();
            for(int t=0;t<data.size();t++){
                if(data.get(t) == entry.getValue()){
                    answer[t] = entry.getKey();
                }
            }
        }*/
      //System.out.println(Arrays.stream(answer).sorted((a,b) -> b.compareTo(a)).collect(Collectors.toList()));//.collect(Collectors.toList()));
       System.out.println(Arrays.toString(answer));
        Arrays.sort(answer, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                char c1 = s1.charAt(n);
                char c2 = s2.charAt(n);
             //   System.out.println(c1+", "+c2);
                // n번째 문자가 같을 경우에 원본 스트링을 사전순으로
                if(c1 == c2){
                    System.out.println("s1:"+s1+">"+c1+", s2:"+s2+">"+c2+" = "+s1.compareTo(s2));
                    return s1.compareTo(s2);
                } else{
                    System.out.println("s1:"+s1+">"+c1+", s2:"+s2+">"+c2+" = "+(c1 - c2));
                    return c1 - c2;
                }
            }
        });

       /* ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }*/
        return answer;
    }
}

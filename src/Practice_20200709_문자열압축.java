public class Practice_20200709_문자열압축 {
    public static void main(String[] args) {
//      int result1 = solution("aabbaccc");
//       int result2 = solution("ababcdcdababcdcd");
        //      int result3 = solution("abcabcdede");
        //   int result4 = solution("abcabcabcabcdededededede");
       int result5 = solution("trtrtrqqqqppppppp");
        System.out.println(result5);
        //7, 9, 8, 14, 17
    }
    public static int solution(String s) {

        if (s.length() <= 1) {
            return s.length();
        }

        int iMin = 1000;

        // 단위를 늘려가며 문자열 자르기 반복문
        for (int iUnit = 1; iUnit <= s.length() / 2; iUnit++) {

            int iBefore_Count = 1;
            int iSum = 0;
            int iUnitCount = (int) Math.ceil(s.length() / (double) iUnit);
            System.out.println(iUnitCount);
            String strNow = "";
            String strNext = "";

            // 배열 현재값과 다음값 비교 반복문
            for (int i = 0; i < iUnitCount - 1; i++) {

                // 길이별로 복사해서 문자열 할당
                strNow = s.substring(i * iUnit, (i + 1) * iUnit);
                strNext = ((i + 2) * iUnit <= s.length())
                        ? s.substring((i + 1) * iUnit, (i + 2) * iUnit)
                        : s.substring((i + 1) * iUnit);

                // 같을 때
                if (strNow.equals(strNext)) {

                    iBefore_Count++;

                    if (i == iUnitCount - 2)  {
                        iSum += (iBefore_Count+"").length() + iUnit;
                    }
                    continue;
                }

                // 다를 때
                if (iBefore_Count == 1) {
                    iSum += iUnit;
                }
                if (iBefore_Count > 1) {
                    iSum += (iBefore_Count+"").length() + iUnit;
                }
                iBefore_Count = 1;

                if (i == iUnitCount - 2)  {
                    iSum += strNext.length();
                }
            }

            // 최소값
            if (iMin > iSum) {
                iMin = iSum;
            }
        }
        return iMin;
    }
// 하 또못품..
    public static int solution_bak(String s) {
        int answer = s.length();
        int cnt = 2;
//        while(cnt <= (s.length()/2)){
            int dataC=1;
            String result="";
            String strStart = s.substring(0, cnt);
            String strEnd = s.substring(cnt, (cnt+cnt));
            System.out.println("strStart>>>"+strStart+", strEnd=>"+strEnd+", cnt==>"+cnt);
            if(strStart.equals(strEnd)){
                System.out.println(s.length()-cnt);
                for(int i=cnt;i<=(s.length()-cnt);i=i+cnt){
                    System.out.println(cnt+"?///"+(s.length()-cnt));
                    String subIdx = s.substring(i, i+cnt);
                    if(subIdx.equals(strStart)){
                        dataC++;
                    }else{
                        result += (dataC==1? "" : dataC)  + strStart;
                        dataC=1;
                        //strStart = subIdx;
                        System.out.println(result+",,,"+s.length()+", "+(i+cnt) +",   "+cnt+", subIdx..."+subIdx+"////"+strStart);
                        if(s.length() - (i+cnt) < cnt){
                            System.out.println("111111111111111111111111");
                            result += s.substring(i, s.length());
                        }else{
                            System.out.println("22222222222222222222222222");
                            strStart = subIdx;
                            System.out.println(strStart);
                        }
                    }
                    if(i==(s.length()-cnt)){
                        result += (dataC==1? "": dataC)  + strStart;
                    }
                }
                System.out.println("result===>"+result);
                if(answer > result.length() && result.length()>0){
                    answer = result.length();
                }
            }
            cnt++;
    //    }

        return answer;
    }
}

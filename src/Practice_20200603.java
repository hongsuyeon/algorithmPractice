import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Practice_20200603 {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        //ArrayList<String> skillTrees = new ArrayList<String>();
        Iterator<String> it = skillTrees.iterator();

        while (it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                //System.out.println(it);
                it.remove();
            }
        }
        answer = skillTrees.size();
        return answer;
    }

    public static void main(String[] args) {
        int count = solution("CBD",new String[]{"BACDE", "CBADF", "AECB", "BDA"});
        //int count = solution("CBD",new String[]{"CBADF", "AECB", "BDA"});
        System.out.println(count);
    }
}

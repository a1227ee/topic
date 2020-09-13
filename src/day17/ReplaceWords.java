package day17;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName ReplaceWords
 * @Deacription: 648. 单词替换
 * @Author zzx
 * @Date 2020/8/31 9:21
 **/

public class ReplaceWords {
    public String replaceWords(List<String> roots, String sentence) {
        Set<String> rootset = new HashSet();
        for (String root: roots) rootset.add(root);

        StringBuilder ans = new StringBuilder();
        for (String word: sentence.split("\\s+")) {
            String prefix = "";
            for (int i = 1; i <= word.length(); ++i) {
                prefix = word.substring(0, i);
                if (rootset.contains(prefix)) break;
            }
            if (ans.length() > 0) ans.append(" ");
            ans.append(prefix);
        }
        return ans.toString();

    }


}

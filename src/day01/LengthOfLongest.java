package day01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LengthOfLongest {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0){
            return 0;
        }
        int res=-1;
        char[] chars = s.toCharArray();
        HashMap<Object, Object> map = new HashMap<>();

        int l=-1;
        for (int r=0; r < chars.length; r++) {
            if (map.containsKey(chars[r])){
                l= Math.max(l,(int) map.get(chars[r]));
            }
            map.put(chars[r],r);
            res=Math.max(res,r-l);
        }
        return res;

    }
}

package nowcoder.JZ32;

import java.util.ArrayList;
import java.util.Comparator;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        ArrayList<String> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(number+"");
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String a1 = o1+o2;
                String a2 = o2+o1;
                return a1.compareTo(a2);

            }
        });

        StringBuilder ans = new StringBuilder();
        for (String s : list) {
            ans.append(s);
        }
        return ans.toString();
    }
}

import sun.applet.Main;

import javax.lang.model.element.NestingKind;
import java.util.*;

public class MyClass {

    public String sayHello() {
        return "Hello";
    }

    public int transferNum(int num) {
        if (num == 0) {
            return 1;
        } else if (num % 2 == 0) {
            return num + transferNum(num - 2);
        } else if (num % 2 != 0) {
            return num;
        } else {
            return num;
        }
    }

    public Collection<String> doSomethingStrangeWithCollection(
            Collection<String> collection
    ) {
        Map<Integer, List<String>> groupsByLength = new HashMap<Integer, List<String>>();
        for (String s : collection) {
            List<String> strings = groupsByLength.get(s.length());
            if (strings == null) {
                strings = new ArrayList<>();
                groupsByLength.put(s.length(), strings);
            }
            strings.add(s);
        }

        int maximumSizeOfGroup = 0;
        for (List<String> group : groupsByLength.values()) {
            if (group.size() > maximumSizeOfGroup) {
                maximumSizeOfGroup = group.size();
            }
        }

        for (List<String> group : groupsByLength.values()) {
            if (group.size() == maximumSizeOfGroup) {
                return group;
            }
        }
        return null;
    }
}





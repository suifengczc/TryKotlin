package KotlinKoans.Collections.GetUsedToNewStyle

/*
Get used to new style

Rewrite the following Java function to Kotlin.
这段代码是返回collection中string长度相同数量最多的一个list
public Collection<String> doSomethingStrangeWithCollection(
        Collection<String> collection
) {
    Map<Integer, List<String>> groupsByLength = Maps.newHashMap();
    for (String s : collection) {
        List<String> strings = groupsByLength.get(s.length());
        if (strings == null) {
            strings = Lists.newArrayList();
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

 */

fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {

    val groupsByLength = collection. groupBy { s -> s.length }//按照string的长度分组

    val maximumSizeOfGroup = groupsByLength.values.map { group -> group.size }.max()//得到groupsByLength中最大的size

    return groupsByLength.values.firstOrNull { group -> group.size == maximumSizeOfGroup}//使用firstOrNull得到最大size的group
}
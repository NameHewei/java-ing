package collection;

import java.util.Comparator;

/**
 * 定义一个临时的比较规则
 */
public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // 返回值等于0  表示相等，大于0 o1大于o2 ，小于0 o1小于o2
        return o1.name.compareTo(o2.name);
    }
}

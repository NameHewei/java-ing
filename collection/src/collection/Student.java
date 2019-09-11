package collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 学生类
 * 定义默认的比较规则
 */
public class Student implements Comparable<Student> {
    public String id;
    public String name;
    public Set<Course> courses;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new HashSet<Course>();
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}

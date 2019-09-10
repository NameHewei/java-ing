package collection;

import java.util.ArrayList;
import java.util.List;

public class CourseGeneric {
    /**
     * 泛型（Course）的 List
     */
    public List<Course> courseList;

    public CourseGeneric () {
        this.courseList = new ArrayList<Course>();
    }

    public void add() {
        Course cr1 = new Course("1", "语文");
        courseList.add(cr1);
    }

    /**
     * 通过for each遍历
     */
    public void useForEach () {
        System.out.println("使用for each");
        /* 这里就不用再做强制转换 */
        for (Course cr: courseList) {
            System.out.println(cr.id + ":" + cr.name);
        }
    }

    /**
     * 加了泛型，其子类也可以添加
     */
    public void childGe() {
        ChildCourse childCourse = new ChildCourse();
        childCourse.id = "10";
        childCourse.name = "子类";
        courseList.add(childCourse);
    }

    public static void main(String[] args) {
        CourseGeneric cl = new CourseGeneric();
        cl.add();
        cl.childGe();
        cl.useForEach();
    }

}

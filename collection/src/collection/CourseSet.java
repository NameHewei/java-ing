package collection;

import java.util.*;

/**
 * Set 在学生类中
 */

public class CourseSet {
    public List<Course> courseList;

    public CourseSet () {
        courseList = new ArrayList<>();
    }

    /**
     * 添加course
     */
    public void addCourse() {
        Course c1 = new Course("1", "语文");
        courseList.add(c1);
        Course c2 = new Course("2","数学");
        courseList.add(1, c2);
        Course[] arr = {new Course("3", "英语"), new Course("4", "化学")};
        courseList.addAll(Arrays.asList(arr));
    }

    /**
     * 给学生添加课程
     */
    public void addStuCou () {
        Student stu = new Student("1", "jack");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入课程ID");
            String in = scanner.next();
            for (Course cr: courseList) {
                if(cr.id.equals(in)) {
                    stu.courses.add(cr);
                    stu.courses.add(cr);
                }
            }
        }

        System.out.println("共：" + stu.courses.size());
        for (Course sc: stu.courses) {
            System.out.println("学生课程：" + sc.id + ":" + sc.name);
        }
    }

    /**
     * 通过for each遍历
     */
    public void useForEach () {
        System.out.println("使用for each");
        for (Course cr: courseList) {
            System.out.println(cr.id + ":" + cr.name);
        }
    }

    public void listContain() {
        Course s = courseList.get(0);
        System.out.println("包含：" + courseList.contains(s));

    }

    public static void main(String[] args) {
        CourseSet cs = new CourseSet();
        cs.addCourse();
        cs.useForEach();
        cs.addStuCou();
        cs.listContain();
    }
}

package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 备选课程
 */
public class ListTest {
    /**
     * 用于存放备选课程的List
     */
    public List coursesList;

    public  ListTest() {
        this.coursesList = new ArrayList();
    }

    /**
     * 添加course
     */
    public void addCourse() {
        Course c1 = new Course("1", "语文");
        coursesList.add(c1);

        /*
         * 对象插曲集合会被忽略类型，变成Object，取出时需要做转换
         */
        Course temp = (Course) coursesList.get(0);
//        System.out.println("添加了课程-" + temp.id + ":" + temp.name);

        Course c2 = new Course("2","数学");
        /*
         * 当传的值刚好为length时，就在队尾添加
         */
        coursesList.add(1, c2);
        Course temp2 = (Course) coursesList.get(0);
//        System.out.println("添加了课程-" + temp2.id + ":" + temp2.name);

        Course[] c3 = { new Course("3", "英语"), new Course("4", "物理") };
        coursesList.addAll(Arrays.asList(c3));
        Course temp3 = (Course) coursesList.get(2);
        Course temp4 = (Course) coursesList.get(3);
        System.out.println("添加了课程-" + temp3.id + ":" + temp3.name);
        System.out.println("添加了课程-" + temp4.id + ":" + temp4.name);

        Course[] c4 = {new Course("3", "化学"), new Course("4", "生物")};
        coursesList.addAll(4, Arrays.asList(c4));
        Course temp5 = (Course) coursesList.get(4);
        System.out.println("添加了课程-" + temp5.id + ":" + temp5.name);
    }

    public static void main(String[] args) {
        ListTest lt = new ListTest();
        lt.addCourse();
    }
}

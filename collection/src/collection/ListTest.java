package collection;

import java.nio.charset.CoderResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
         * 对象插入集合会被忽略类型，变成Object，取出时需要做转换
         */
        Course temp = (Course) coursesList.get(0);
//        System.out.println("添加了课程-" + temp.id + ":" + temp.name);

        Course c2 = new Course("2","数学");
        /*
         * 当传的值刚好为length时，就在队尾添加
         */
        coursesList.add(1, c2);
        Course temp2 = (Course) coursesList.get(0);

        /* 添加重复的 */
        coursesList.add(1, new Course("2", "数学"));

        Course[] c3 = { new Course("3", "英语"), new Course("4", "物理") };
        coursesList.addAll(Arrays.asList(c3));
        Course temp3 = (Course) coursesList.get(2);
        Course temp4 = (Course) coursesList.get(3);

        Course[] c4 = {new Course("5", "化学"), new Course("6", "生物")};
        coursesList.addAll(3, Arrays.asList(c4));
        Course temp5 = (Course) coursesList.get(4);

    }

    public void useFor() {
        System.out.println("使用for");
        for (int i = 0; i < coursesList.size(); i++) {
            Course temp6 = (Course) coursesList.get(i);
            System.out.println("课程-" + temp6.id + ":" + temp6.name);
        }
    }

    /**
     * 通过迭代器遍历
     */
    public void useIterator () {
        System.out.println("使用迭代器");
        Iterator it = coursesList.iterator();
        while (it.hasNext()) {
            Course cr = (Course) it.next();
            System.out.println(cr.id + ":" + cr.name);
        }
    }

    /**
     * 通过for each遍历
     */
    public void useForEach () {
        System.out.println("使用for each");
        for (Object obj: coursesList) {
            Course cr = (Course) obj;
            System.out.println(cr.id + ":" + cr.name);
        }
    }

    /**
     * 修改
     */
    public void modifyData () {
        System.out.println("修改索引2的数据");
        coursesList.set(2, new Course("7", "历史"));
    }

    /**
     * 删除
     */
    public void del () {
        System.out.println("删除索引1");
        /* 也可以传索引值 */
//        Course cr = (Course) coursesList.get(1) ;
//        coursesList.remove(cr);
        Course[] arr = { (Course) coursesList.get(3), (Course) coursesList.get(4)  };
        coursesList.removeAll(Arrays.asList(arr));
    }

    public static void main(String[] args) {
        ListTest lt = new ListTest();
        lt.addCourse();
//        lt.useFor();
//        lt.useIterator();
//        lt.useForEach();
//        lt.modifyData();
        lt.useForEach();
        lt.del();
        lt.useForEach();
    }
}

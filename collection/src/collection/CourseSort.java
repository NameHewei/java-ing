package collection;

import java.util.*;

public class CourseSort {
    public void praSort() {
        /*
         * 数字和字符串泛型相同
         */
        List<Integer> integerList = new ArrayList<Integer>();
        Random random = new Random();
        Integer x = 0;
        for (int i = 0; i < 10 ; i++) {
            do {
                x = random.nextInt(100);
            } while (integerList.contains(x));
            System.out.println(i);
            integerList.add(x);
        }
        for (Integer ig: integerList) {
            System.out.println("number: " + ig);
        }
        System.out.println("-----------after sort----------");
        Collections.sort(integerList);
        for (Integer ig: integerList) {
            System.out.println("number: " + ig);
        }
    }

    /**
     * 对学生进行排序
     */
    public void studentSort() {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("4", "Hew"));
        students.add(new Student("2", "tom"));
        students.add(new Student("3", "Jerry"));

        for (Student st: students) {
            System.out.println(st.id + ": " + st.name);
        }

        Collections.sort(students);
        System.out.println("======after sort=====");

        for (Student st: students) {
            System.out.println(st.id + ": " + st.name);
        }

        System.out.println("======use comparator compare by name =====");
        Collections.sort(students, new StudentComparator());
        for (Student st: students) {
            System.out.println(st.id + ": " + st.name);
        }

    }

    public static void main(String[] args) {
        CourseSort cs = new CourseSort();
//        cs.praSort();
        cs.studentSort();
    }
}

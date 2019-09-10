package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 实践Map
 */
public class CourseMap {
    public Map<String, Student> students;

    public CourseMap() {
        this.students = new HashMap<String, Student>();
    }

    public void mapPut() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String id = scanner.next();
            if(students.get(id) == null) {
                String name = scanner.next();
                students.put(id, new Student(id, name));
            } else {
                System.out.println("id 重复");
                continue;
            }
            Student stu = students.get(id);
            System.out.println("添加了学生："+ stu.id + ":" + stu.name);
        }
    }

    public void loopMap() {
        Set<String> ks = students.keySet();
        System.out.println("总共输入了：" + students.size() + "个学生");
        for (String k: ks) {
            Student stu = students.get(k);
            System.out.println("学生："+ stu.id + "-" + stu.name);
        }
    }

    public void removeMap() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要删除学生id");
            String id = scanner.next();
            if(students.get(id) == null) {
                System.out.println("id 不存在");
            } else {
                students.remove(id);
                break;
            }
        }
    }

    public void entrySetMap(){
        Set<Map.Entry<String, Student>> entrySet = students.entrySet();
        for (Map.Entry<String, Student> en: entrySet) {
            System.out.println("entryMap: " + en.getKey() + "-" + en.getValue().name);
        }
    }

    public static void main(String[] args) {
        CourseMap cm = new CourseMap();

        cm.mapPut();
        cm.loopMap();
        cm.removeMap();
        cm.entrySetMap();
    }
}

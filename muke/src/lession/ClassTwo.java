package lession;

/*引入其它包的类 */
import lession.second.Pra;
/* 乘号表示所有类 */
import lession.second.*;


/*
 1. 面向对象特性： 封装、继承、多态
 2. 包：管理java文件解决同名文件冲突；定义包：package 包名；必须放在程序的第一行，包名间用.隔开；包名规范是全小写
* */

/*
 访问修饰符：修饰属性和方法的访问范围
 private： 本类
 默认：本类，同包
 protected：本类，同包，子类
 public：本类，同包，子类，其它
* */

public class ClassTwo {
    private String name = "hew";
    private static int num = 1;
    static String color = "orange";

    private void getName() {
        this.name = "new";
        System.out.println(this.name);
    }

    /* 成员内部类 */
    public class InnerClass {
        public void showMess () {
            int num = 2;
            System.out.println("this inner class: " + num + "--" + name  + "--" + ClassTwo.this.num);
        }
    }

    /* 静态内部类 */
    public static class InnerStatic {
        static String color = "pink";
        public void showMess () {
            /*
            * 静态内部类不能直接访问外部类的非静态成员，但可以通过 new 外部类().成员 的方式访问
            * 外部类的静态成员与内部类的成员名称相同，可通过“类名.静态成员”访问外部类的静态成员
            * 外部类的静态成员与内部类的成员名称不相同，则可通过“成员名”直接调用外部类的静态成员
            * */
            int num = 2;

            ClassTwo ct = new ClassTwo();
            System.out.println("this inner class: " + num + "--" + ClassTwo.num + "--"  + ct.name  + "--" + ClassTwo.color);
        }
    }

    /* 方法内部类 */
    public void innerFun() {
        int num = 10;
        /* 不能在外部类的方法以外的地方使用；所以不能家访问控制符和static修饰符 */
        class InnerFn {
            int count = 2;
            private void print() {
                System.out.println("方法内部类：" + num + "--" + count);
            }
        }

        InnerFn ifn = new InnerFn();
        ifn.print();
    }

    public static void main(String[] args) {
        Pra pr = new Pra();
        pr.pre();

        ClassTwo ct = new ClassTwo();
        ct.name = "hew-e";
        ct.getName();

        InnerClass ic = ct.new InnerClass();
        ic.showMess();

        InnerStatic is = new InnerStatic();
        is.showMess();

        ct.innerFun();
    }
}

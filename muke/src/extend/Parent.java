package extend;

/*
 * 继承：java中继承是单继承
 * 子类拥有父类所有的属性和方法（修饰符不能是private）
 * 语法
 * class 子类 extends 父类
 * */
public class Parent {
    public String gender = "man";
    public int age = 10;

    public void doSome() {
        System.out.println("parent do something: " + gender + "--" + age);
    }
}

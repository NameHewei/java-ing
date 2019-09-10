package extend;

public class Child extends Parent {
    public  int age = 12;
    /* 方法重写：返回值类型 方法名 参数 一致 */
    public void doSome() {
        System.out.println("child do something");
    }

    public void useSuper() {
        super.doSome();
        System.out.println("用supper获取父类的属性age：" + super.age + "--" + age);
    }


    public String toString() {
        return "age:" + age;
    }
}

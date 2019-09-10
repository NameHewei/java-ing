package abstr;

/* 抽象类不能被实例化只能继承， 子类继承时必须实现抽象类中的方法 */
public class Mug extends Cup {
    public void fill() {
        System.out.println("fill something");
    }
}

package interf;

/*
 * 接口是规范，定义一批类说需要遵守的规范
 * 一般是用来继承，所以使用public修饰,不用怕private和protected
 * 内容为：常量或抽象方法
 * 可以多继承
 * 系统会默认加上 abstract
 * [修饰符] abstract interface 接口名 [extends 父接口1, 父接口2]
 * {
 *   零到多个常量定义，即使添加时不加上 public static final  系统也会自动加上
 *   零到多个抽象方法定义，即使不加上 public abstract  系统也会自动加上
 * }
 *
 * 一个类可以实现一个或多个接口
 * 继承父类实现接口语法：
 * [修饰符] class 类名 extends 父类 implements 接口1, 接口2
 * {
 *  如果继承了抽象类，要实现继承的抽象方法，要实现接口中的抽象方法
 * }
 */
public interface IPlayGame {
    public void playGame();
}

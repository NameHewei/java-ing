package lession;

public class InitConstructor {
    static String StaticName = "";

    /**
     * 方法名与类名相同
     */
    public InitConstructor() {
        System.out.println("no params");
    }

    /**
     * 有参数构造方法
     */
    public InitConstructor(String name) {
        System.out.println("new name:" + name);
    }
}

package Lession;

public class InitConstructor {
    String name;

    /**
     * 方法名与类名相同
     */
    public InitConstructor() {
        System.out.println("no params");
    }

    /**
     * 有参数构造方法
     */
    public InitConstructor(String _name) {
        name = _name;
        System.out.println("new name:" + name);
    }
}

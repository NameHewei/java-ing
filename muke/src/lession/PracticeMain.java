package lession;

public class PracticeMain {
    private static String strStatic = "1233ddd";
    private String name1 = "name1";


    /* 初始化块，可包含多个，当创建类的实例时，就会依次执行这些代码块 */
    {
        name1 = "普通初始化块";
        System.out.println(name1 + "-初始化块，赋值");
    }
    /* 静态初始化块，只在类加载时执行，且只会执行一次，同时静态初始化块只能给静态变量赋值 */
    static {
        strStatic = "250000";
        System.out.println(strStatic + "-静态初始化块，赋值静态变量");
    }

    /* 构造方法: 在普通初始化块后执行 */
    private PracticeMain(String newName) {
        System.out.println("构造方法：" + name1);
        name1 = newName;
    }

    /* 静态方法 */
    private static String change() {
        /* 不能直接访问非静态变量，和非静态方法 */
        PracticeMain pm = new PracticeMain("1");
        return "静态方法返回值:" + strStatic + "-" + pm.name1;
    }

    /* 普通成员方法 */
    private void getF() {
        /* 可以直接访问非静态变量，和静态变量 */
//        System.out.println("普通方法：" + name1 + '-' + strStatic);
        System.out.println("访问初始化块修改的数据：" + name1 + '-' + strStatic);
    }

    public static void main(String[] arg) {
//        Practice pra = new Practice();
//        pra.phone = 45.36f;
//        pra.message = "this is message";
//        pra.call();
//        pra.sendMessage();
        /*
          这里会执行一次InitConstructor方法中的代码
         */
//        InitConstructor initConstructor = new InitConstructor();
//        InitConstructor initConstructor1 = new InitConstructor("hew");

        /*
         * static
         */
        /* 直接获取 */
//        System.out.println("direct get: " + strStatic);
        PracticeMain practiceMain = new PracticeMain("name2");
//
//        /* 通过类获取 */
//        System.out.println("get by constructor: " + PracticeMain.strStatic);
//
//        practiceMain.strStatic = "changed";
//        /* 通过对象获取 */
//        System.out.println("get by object: " + practiceMain.strStatic);

        /* 调用静态方法 */
//        System.out.println(PracticeMain.change());
//        System.out.println("直接调用：" + change());
        practiceMain.getF();
    }
}

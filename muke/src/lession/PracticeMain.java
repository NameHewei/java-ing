package lession;

public class PracticeMain {
    private static String strStatic = "1233ddd";
    String name1 = "name1";

    /* 静态方法 */
    public static void change() {
            
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
        System.out.println("direct get: " + strStatic);
        PracticeMain practiceMain = new PracticeMain();

        /* 通过类获取 */
        System.out.println("get by constructor: " + PracticeMain.strStatic);

        practiceMain.strStatic = "changed";
        /* 通过对象获取 */
        System.out.println("get by object: " + practiceMain.strStatic);



    }
}

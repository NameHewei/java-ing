package Lession;

public class PracticeMain {
    static String str = "123456";
    public static void main(String[] arg) {
//        Practice pra = new Practice();
//        pra.phone = 45.36f;
//        pra.message = "this is message";
//        pra.call();
//        pra.sendMessage();
        /**
         * 这里会执行一次InitConstructor方法中的代码
         */
//        InitConstructor initConstructor = new InitConstructor();
//        InitConstructor initConstructor1 = new InitConstructor("hew");

        /**
         * static
         */
        System.out.println("direct get" + str);
        PracticeMain practiceMain = new PracticeMain();



        System.out.println("get by constructor" + PracticeMain.str);






        System.out.println("get by object" + practiceMain.str);



    }
}

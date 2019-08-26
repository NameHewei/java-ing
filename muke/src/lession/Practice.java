package lession;

public class Practice {
    /**
     * 声明属性
     */
    float phone;
    String message;
    int count;

    void call() {
        /**
         * 局部变量要加初始值
         */
        int num = 0;
        System.out.println("call phone:" + phone + "-" + num);
    }

    void sendMessage() {
        System.out.println("send message：" + message + "-" + count);
    }

}

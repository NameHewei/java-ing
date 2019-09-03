package interf;

public class MainExecute {
    public static void main(String[] args) {
        IPlayGame ip1 = new Psp();
        IPlayGame ip2 = new SmartPhone();
        ip1.playGame();
        ip2.playGame();


        Psp p3 = new Psp();
        p3.playGame();

        IPlayGame ip3 = new IPlayGame() {
            @Override
            public void playGame() {
                System.out.println("使用匿名内部类的方式实现接口");
            }
        };

        ip3.playGame();

        new IPlayGame() {
            @Override
            public void playGame() {
                System.out.println("使用匿名内部类的方式实现接口,直接调用");
            }
        }.playGame();


    }
}

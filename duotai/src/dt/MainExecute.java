package dt;

public class MainExecute {
    /* 注意这里声明的是Animal */
    public static void execute(Animal am) {
        am.sleep();
        if(am instanceof Sheep) {
            Sheep sp = (Sheep) am;
            sp.eat();
        } else {
            Tiger tg = (Tiger) am;
            tg.eat();
        }
    }
    public static void main(String[] args) {
        // 语句在堆内存中开辟了子类(Tiger)的对象，并把栈内存中的父类(Animal)的引用指向了这个Tiger对象。
//        Animal am = new Tiger();
//        am.eat();
//        am.sleep();
//        System.out.println(am.num);
//        System.out.println(am.weight);
//        System.out.println("====================");

        /* 无法访问子类特有的方法和属性 */
//        System.out.println(am.name);
//        am.catchSheep();

        /* 强制转换后可以使用子类特有的属性和方法 */
//        Tiger tg = (Tiger) am;
//        System.out.println(tg.name);
//        tg.catchSheep();


        Animal animal = new Tiger();
        animal.sleep();
        Tiger tg = (Tiger) animal;
        tg.sleep();
        execute(new Sheep());
        execute(new Tiger());

    }
}

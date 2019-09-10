package extend;

public class Execute {
    public static void main(String[] args) {
//        Child ci = new Child();
//        ci.age = 22;
//        ci.doSome();
//        ci.useSuper();
//        System.out.println(ci.toString());

        /* 多态 */
//        Parent obj1 = new Parent();
//        Parent obj2 = new Child();
//
//        obj1.doSome();
//        obj2.doSome();

        /* 类型转换 */
        Child c1 = new Child();
        Parent p1 = c1;
        if(p1 instanceof Child) {
            Child c2 = (Child) p1;
            System.out.println("能转换");
        } else {
            System.out.println("不能转换");
        }

    }
}

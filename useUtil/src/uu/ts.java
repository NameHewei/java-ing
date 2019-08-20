package uu;
//import java.util.Scanner;
import java.util.Arrays;

public class ts {
    public static void main(String [] args) {
        /**
         * 创建Scanner对象
         */
        /*Scanner input = new Scanner(System.in);
        System.out.println("please input number");
        int val = input.nextInt();
        System.out.println("you input the number: "+val);*/

        /**
         * 数组排序
         */
        String[] names = {"sports", "game", "movie" };
        Arrays.sort(names);
//        for (int i = 0; i < names.length; i++) {
//            System.out.println("name:"+names[i]);
//        }
//        System.out.println("all name:" + Arrays.toString(names));

        /**
         * foreach
         */
        for (String s:names) {

            System.out.println("foreach: " + s);
        }
    }
}

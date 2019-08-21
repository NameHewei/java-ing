package uu;
//import java.util.Scanner;
import java.util.Arrays;

public class ts {

    /**
     * 方法
     */
    public void pri(String words) {
        System.out.println(words);
    }

    public int[] getGood(int[] scores) {
        Arrays.sort(scores);
        int len = scores.length;
        int[] res = new int[3];
        int a= len -1;
        for (int i = a, j = 0; i > len - 4  ; i--,j++) {
//            System.out.println("score: "+scores[i]);
            res[j] = scores[i];
        }

        return res;
    }

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
//        String[] names = {"sports", "game", "movie" };
//        Arrays.sort(names);
//        for (int i = 0; i < names.length; i++) {
//            System.out.println("name:"+names[i]);
//        }
//        System.out.println("all name:" + Arrays.toString(names));

        /**
         * foreach
         */
//        for (String s:names) {
//            System.out.println("foreach: " + s);
//        }

        /**
         * 二维数组
         */
//        int[][] arrTwo = { {1,2,3}, {4,5,6 } };
//
//        for (int i = 0; i < arrTwo.length; i++) {
//            for (int j = 0; j < arrTwo[i].length; j++) {
//                System.out.println(arrTwo[i][j]);
//            }
//        }

//        ts out = new ts();
//        out.pri("hello dog");
//        double a = Math.random() * 100;
//        System.out.println(Math.floor(a));

        int[] scores = { 89 , -23 , 64 , 91 , 119 , 52 , 73 };

        ts getG = new ts();

        System.out.println(Arrays.toString(getG.getGood(scores)));
    }
}

package course;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorCourse {
    public String printF() {
        Scanner input = new Scanner(System.in);
        /* 执行循序和js一致 */
        try {
            System.out.print("请输入第一个输：");
            int one = input.nextInt();
            System.out.print("请输入第二个输：");
            int two = input.nextInt();
            System.out.println("division: " + one / two);
        } catch (InputMismatchException e){
            System.out.println("请输入整数");
            return "input error";
        } catch (ArithmeticException e) {
            System.out.println("算术异常，除数不能为0");
            return "catch arithmetic error";
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("未知异常");
        } finally {
            System.out.println("finally");
//            return "finally return";
        }
        return "fn return";
    }

    public void error1() throws CustomError {
        throw new CustomError("手动抛出异常");
    }

    public void error2() {
        ErrorCourse ec = new ErrorCourse();
        try {
            ec.error1();
        } catch(CustomError e) {
            throw new RuntimeException("新的运行异常", e);
        }
    }

    public static void main(String[] args) {
        ErrorCourse ec = new ErrorCourse();
//        String res =  ec.printF();
//        System.out.println("over: " + res);

        /*  */
        try {
            ec.error2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

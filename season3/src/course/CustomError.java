package course;

/* 自定义异常 */
public class CustomError extends Exception {
    public CustomError () {}
    public CustomError (String msg) {
        super(msg);
    }
}

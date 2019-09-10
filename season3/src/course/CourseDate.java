package course;
import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class CourseDate{
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(d));

        String ds = "2019.09.03 12:15:11";
        String ds1 = "2019-09-03 12:15:11";
        SimpleDateFormat s = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date dsObj = s.parse(ds);
        Date dsObj1 = sdf.parse(ds1);
        System.out.println(dsObj);
        System.out.println(dsObj1);
        System.out.println("---------------------------------");


        Calendar cal = Calendar.getInstance();
        int mon = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        System.out.println(cal.get(Calendar.YEAR) + "-" + mon + "-" + day + " " + hour);

        System.out.println(cal.getTimeInMillis());
    }
}

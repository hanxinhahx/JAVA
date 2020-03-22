package BasicKnowge;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Time {
    public static void main(String[] args) {
        SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(time.format(new Date()));
    }
}

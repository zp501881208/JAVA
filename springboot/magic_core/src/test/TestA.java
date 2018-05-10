import com.magict.magic.util.DateUtil;

import java.util.Date;

/**
 * @author ZP
 * @date 2018/5/1014:04
 * @description:
 */
public class TestA {
    public static void main(String[] args) {

        Date datenow = new Date();
        Date date = DateUtil.calTime(datenow,1,3,5);
        System.out.println("datenow:["+DateUtil.formatDate(datenow,DateUtil.DATETIME_FORMAT)+"],date:["+DateUtil.formatDate(date,DateUtil.DATETIME_FORMAT)+"]");

    }
}

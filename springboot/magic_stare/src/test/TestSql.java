import com.magict.magic.MagicStareApplication;
import com.magict.magic.entity.WxUser;
import com.magict.magic.service.WxUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ZP
 * @date 2018/4/1716:50
 * @description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MagicStareApplication.class)
public class TestSql {
    @Autowired
    WxUserService wxUserService;

    @Test
    public void testA(){
        WxUser wxUser = wxUserService.findByOpenid("dwefwft454756");
        if(null!=wxUser){
            System.out.println(wxUser.getNickname());
        }

        WxUser wxUser1 = wxUserService.selectByPrimaryKey(1);
        System.out.println(wxUser1.getOpenid()+wxUser1.getCity());

    }

}

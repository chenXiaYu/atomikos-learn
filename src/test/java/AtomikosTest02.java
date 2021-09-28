
import com.domain.OrderInfo;
import com.service.OrderInfoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.Date;


public class AtomikosTest02 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext cat = new ClassPathXmlApplicationContext("spring.xml");
        OrderInfoService orderInfoService = cat.getBean(OrderInfoService.class);

        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setAddress("黑马训练营");
        orderInfo.setCreateTime(new Date());
        orderInfo.setUserid(1);
        orderInfo.setMoney(new BigDecimal("100"));
        //在这里触发异常
        orderInfoService.add(orderInfo);
    }
}

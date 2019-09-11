package cn.kenny.spring;

import cn.kenny.spring.service.IMessageService;
import cn.kenny.spring.service.ISaleCountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdemoApplicationTests {

	@Autowired
	IMessageService messageService;
	@Autowired
	ISaleCountService saleCountService;

	@Test
	public void messageTest(){
		messageService.sendNotification();
	}


	@Test
	public void calculatePrice() {
		double gold = saleCountService.countPrice(100, "Gold");
		System.out.println("价格为：" + gold);
		double platinum = saleCountService.countPrice(100, "Platinum");
		System.out.println("价格为：" + platinum);
		double other = saleCountService.countPrice(100, "other");
		System.out.println("价格为：" + other);

	}



}

package cn.kenny.spring.message;

import cn.kenny.spring.service.IMessageService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author kenny_peng
 * @created 2019/9/11 13:11
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class MessageTest {

    @Autowired
    IMessageService messageService;

    @Test
    public void messageTest(){
        messageService.sendNotification();
    }
}

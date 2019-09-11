package cn.kenny.spring.web;

import cn.kenny.spring.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kenny_peng
 * @created 2019/9/11 13:48
 */
@RestController
public class MessageController {

    @Autowired
    IMessageService messageService;

    @RequestMapping("/test")
    public String testFunction(){
        return messageService.sendNotification();
    }
}

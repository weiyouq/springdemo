package cn.kenny.spring.service.impl;

import cn.kenny.spring.config.SpringContextUtils;
import cn.kenny.spring.config.message.MessageEvent;
import cn.kenny.spring.service.IMessageService;
import org.springframework.stereotype.Service;

/**
 * @author kenny_peng
 * @created 2019/9/11 11:15
 */
@Service
public class MessageServiceImpl implements IMessageService {

//    @Autowired
//    ApplicationContext applicationContext;

    @Override
    public String sendNotification() {
        System.out.println("---------开始发送消息-----------");

        MessageEvent messageEvent = new MessageEvent("发送消息内容");

        SpringContextUtils.publishEvent(messageEvent);

        System.out.println("----------结束发送消息-----------");

        return null;
    }
}

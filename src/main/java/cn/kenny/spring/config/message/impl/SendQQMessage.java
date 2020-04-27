package cn.kenny.spring.config.message.impl;

import cn.kenny.spring.config.message.MessageEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 发送qq消息
 * @author kenny_peng
 * @created 2019/9/11 11:41
 */
@Component
@Async
public class SendQQMessage implements ApplicationListener<MessageEvent> {
    @Override
    public void onApplicationEvent(MessageEvent event) {
        Object source = event.getSource();
        System.out.println("发送qq消息成功:" + source);
    }
}

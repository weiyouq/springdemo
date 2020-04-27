package cn.kenny.spring.config.message.impl;

import cn.kenny.spring.config.message.MessageEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 发送微信消息
 * @author kenny_peng
 * @created 2019/9/11 11:40
 */
@Component
@Async
public class SendWeChatMessage implements ApplicationListener<MessageEvent> {
    @Override
    public void onApplicationEvent(MessageEvent event) {
        System.out.println("发送微信消息成功:" + event.getSource());
    }
}

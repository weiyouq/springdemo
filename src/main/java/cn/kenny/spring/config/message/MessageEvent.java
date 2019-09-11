package cn.kenny.spring.config.message;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * 消息发起事件
 * @author kenny_peng
 * @created 2019/9/11 11:17
 */
//@Component
public class MessageEvent extends ApplicationEvent {
    public MessageEvent(Object source) {
        super(source);
    }
}

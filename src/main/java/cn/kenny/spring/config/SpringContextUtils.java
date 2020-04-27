package cn.kenny.spring.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
 * @author kenny_peng
 * @created 2019/9/11 11:52
 */
@Component
@EnableAsync//Enables Spring's asynchronous method execution capability开启spring异步执行方法的能力
public class SpringContextUtils implements ApplicationContextAware {
    private static ApplicationContext applicationContext; // Spring应用上下文环境

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextUtils.applicationContext = applicationContext;
    }

    public static<T> T getBean(Class<T> requireType)
    {
        return (T)applicationContext.getBean(requireType);
    }

    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }

    public static void publishEvent(ApplicationEvent applicationEvent){
        applicationContext.publishEvent(applicationEvent);
    }

}

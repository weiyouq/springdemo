package cn.kenny.spring.config.price;

import org.springframework.context.ApplicationEvent;

/**
 * @author kenny_peng
 * @created 2019/9/11 14:20
 */
public interface CountPrice {

    /**
     * 该用户打多少折
     * @return
     */
    public double getDiscount();

    /**
     * 用户类型
     * @return
     */
    public String getUserType();

    /**
     * 用户最后得到的价格
     * @param fee   商品价格
     * @return      打折后的价格
     */
    public double calculate(double fee);
}

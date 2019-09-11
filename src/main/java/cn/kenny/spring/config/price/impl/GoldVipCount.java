package cn.kenny.spring.config.price.impl;

import cn.kenny.spring.config.price.CountPrice;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 黄金会员
 * @author kenny_peng
 * @created 2019/9/11 14:20
 */
@Component
public class GoldVipCount implements CountPrice {

    @Override
    public double getDiscount() {
        return 0.8;
    }

    @Override
    public String getUserType() {
        return "Gold";
    }

    @Override
    public double calculate(double fee) {
        return fee * getDiscount();
    }
}

package cn.kenny.spring.config.price.impl;

import cn.kenny.spring.config.price.CountPrice;
import org.springframework.stereotype.Component;

/**
 * @author kenny_peng
 * @created 2019/9/11 14:35
 */
@Component
public class PlatinumVipCount implements CountPrice {
    @Override
    public double getDiscount() {
        return 0.7;
    }

    @Override
    public String getUserType() {
        return "Platinum";
    }

    @Override
    public double calculate(double fee) {
        return fee*getDiscount();
    }
}

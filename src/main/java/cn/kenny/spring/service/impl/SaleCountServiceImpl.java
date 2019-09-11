package cn.kenny.spring.service.impl;

import cn.kenny.spring.config.price.CountPrice;
import cn.kenny.spring.service.ISaleCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kenny_peng
 * @created 2019/9/11 14:14
 */
@Service
public class SaleCountServiceImpl implements ISaleCountService {

    private Map<String, CountPrice> countPriceMap = new HashMap<>();

    @Autowired
    public SaleCountServiceImpl(List<CountPrice> countPrices){
        for (CountPrice countPrice : countPrices){
            countPriceMap.put(countPrice.getUserType(), countPrice);
        }
    }

    @Override
    public double countPrice(int price, String account) {
        CountPrice countPrice = countPriceMap.get(account);
        if (countPrice == null){
            return price;
        }
        return countPrice.calculate(price);
    }
}

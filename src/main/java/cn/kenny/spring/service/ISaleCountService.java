package cn.kenny.spring.service;

/**
 * @author kenny_peng
 * @created 2019/9/11 14:14
 */
public interface ISaleCountService {

    /**
     * 根据商品价格，会员级别计算价格
     * @param price 商品价格
     * @param account 会员级别
     * @return 打折后价格
     */
    public double countPrice(int price, String account);

}

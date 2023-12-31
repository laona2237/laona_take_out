package com.laona.laonatakeout.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.laona.laonatakeout.entity.Orders;

public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}

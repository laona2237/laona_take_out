package com.laona.laonatakeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.laona.laonatakeout.entity.ShoppingCart;
import com.laona.laonatakeout.mapper.ShoppingCartMapper;
import com.laona.laonatakeout.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}

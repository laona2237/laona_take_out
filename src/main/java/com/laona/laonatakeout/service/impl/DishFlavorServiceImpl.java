package com.laona.laonatakeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.laona.laonatakeout.entity.DishFlavor;
import com.laona.laonatakeout.mapper.DishFlavorMapper;
import com.laona.laonatakeout.service.DishFlavorService;
import org.springframework.stereotype.Service;


@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}

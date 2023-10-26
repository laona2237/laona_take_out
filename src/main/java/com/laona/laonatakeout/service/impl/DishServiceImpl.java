package com.laona.laonatakeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.laona.laonatakeout.entity.Dish;
import com.laona.laonatakeout.mapper.DishMapper;
import com.laona.laonatakeout.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {
}

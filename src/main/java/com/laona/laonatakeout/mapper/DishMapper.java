package com.laona.laonatakeout.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.laona.laonatakeout.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}

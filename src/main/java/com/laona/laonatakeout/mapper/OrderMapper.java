package com.laona.laonatakeout.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.laona.laonatakeout.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {

}
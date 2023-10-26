package com.laona.laonatakeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.laona.laonatakeout.entity.Setmeal;
import com.laona.laonatakeout.mapper.SetmealMapper;
import com.laona.laonatakeout.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper, Setmeal> implements SetmealService {
}

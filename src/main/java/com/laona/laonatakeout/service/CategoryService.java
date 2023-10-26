package com.laona.laonatakeout.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.laona.laonatakeout.entity.Category;

public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}

package com.laona.laonatakeout.dto;


import com.laona.laonatakeout.entity.Dish;
import com.laona.laonatakeout.entity.DishFlavor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}

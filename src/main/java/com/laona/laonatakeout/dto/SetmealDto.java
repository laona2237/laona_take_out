package com.laona.laonatakeout.dto;


import com.laona.laonatakeout.entity.Setmeal;
import com.laona.laonatakeout.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}

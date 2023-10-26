package com.laona.laonatakeout.common;


/*
    全局异常处理
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLIntegrityConstraintViolationException;

@ControllerAdvice(annotations = {RestController.class, Controller.class})
@ResponseBody
@Slf4j
public class GlobalExceptionHandler {

    /*
    异常处理方法

     */
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public R<String> exceptHandler(SQLIntegrityConstraintViolationException ex){
        log.error(ex.getMessage());

        if(ex.getMessage().contains("Duplicate entry")){
            String[] split = ex.getMessage().split(" ");
            String msg = split[2] + "已存在";
            return R.error(msg);
        }
        return R.error("失败了");


    }

    /*
    自定义异常处理方法


  */
    @ExceptionHandler(CustomException.class)
    public R<String> exceptHandler(CustomException ex){
        log.error(ex.getMessage());

        return R.error(ex.getMessage());

    }

}

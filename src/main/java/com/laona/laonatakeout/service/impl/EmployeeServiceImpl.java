package com.laona.laonatakeout.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.laona.laonatakeout.entity.Employee;
import com.laona.laonatakeout.mapper.EmployeeMapper;
import com.laona.laonatakeout.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {



}

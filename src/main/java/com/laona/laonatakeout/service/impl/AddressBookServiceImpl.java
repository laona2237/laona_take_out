package com.laona.laonatakeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.laona.laonatakeout.entity.AddressBook;
import com.laona.laonatakeout.mapper.AddressBookMapper;
import com.laona.laonatakeout.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}

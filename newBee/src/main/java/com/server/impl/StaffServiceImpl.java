package com.server.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.entity.Staff;
import com.repository.StaffRepository;
import com.server.StaffService;

import javax.annotation.Resource;

/**
 * Created by bilibili on 2015/10/23.
 */
@Component("staffService")
@Scope("prototype")
public class StaffServiceImpl implements StaffService {

    @Resource
    private StaffRepository staffRepository;

    
    public Staff find(Integer id) {
        return staffRepository.findOne(id);
    }

    
    public Staff create(Staff staff) {
        return staffRepository.save(staff);
    }
}

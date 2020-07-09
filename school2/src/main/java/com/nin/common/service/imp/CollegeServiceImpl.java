package com.nin.common.service.imp;

import com.nin.common.mapper.CollegeMapper;
import com.nin.common.pojo.College;
import com.nin.common.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    private CollegeMapper collegeMapper;

    @Override
    public List<College> getList() {
        return this.collegeMapper.selectAll();
    }

    @Override
    public boolean addCollege(College college) {
        return false;
    }
}

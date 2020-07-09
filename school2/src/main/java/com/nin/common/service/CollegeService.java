package com.nin.common.service;

import com.nin.common.pojo.College;

import java.util.List;


public interface CollegeService {

    public List<College> getList();


    public boolean addCollege(College college);

}

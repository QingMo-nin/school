package com.nin.common.service;

import com.nin.common.pojo.Major;

import java.util.List;

public interface MajorService {

    public Major getById(int id);
    public boolean add(Major major);
    public boolean update(Major major);
    public boolean delete(int mid);

    public List<Major> getAll();
    public List<Major> getList(Integer cid);
}

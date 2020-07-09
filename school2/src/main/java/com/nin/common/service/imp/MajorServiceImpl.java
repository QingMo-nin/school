package com.nin.common.service.imp;

import com.nin.common.mapper.MajorMapper;
import com.nin.common.pojo.Major;
import com.nin.common.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class MajorServiceImpl implements MajorService {

    @Autowired
    private MajorMapper majorMapper;

    @Override
    public Major getById(int id) {
        //根据主键进行查询,必须保证结果唯一
        return majorMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean add(Major major) {
        //插入一条数据,只插入不为null的字段,不会影响有默认值的字段
        int count = majorMapper.insertSelective(major);
        return count > 0 ? true : false;
    }

    @Override
    public boolean update(Major major) {
        //根据主键进行更新
        //只会更新不是null的数据
        return majorMapper.updateByPrimaryKeySelective(major) > 0 ? true : false;
    }

    @Override
    public boolean delete(int mid) {
        //通过主键进行删除,这里最多只会删除一条数据
        return majorMapper.deleteByPrimaryKey(mid) > 0 ? true : false;
    }

    @Override
    public List<Major> getAll() {
        return majorMapper.selectAll();
    }

    @Override
    public List<Major> getList(Integer cid) {
        Example example = new Example(Major.class);
        //sql过滤表达式
        Example.Criteria criteria = example.createCriteria();
        //参数1：实体类字段 参数2：值
        criteria.andEqualTo("cid", cid);
        //criteria.orLike("cid", "%"+cid+"%");
        //example.orderBy("mid").desc();

        List<Major> list = majorMapper.selectByExample(example);
        return list;
    }
}

package com.study.dao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.admin.service.BaseService;
import com.study.admin.vo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.io.Serializable;
import java.util.List;

public abstract class BaseServiceImpl<T> implements BaseService<T> {

    //在spring 4.x版本之后的泛型依赖注入
    @Autowired
    private Mapper<T> mapper;


    public List<T> findAll() {
        return mapper.selectAll();
    }


    public T findOne(Serializable id) {
        return mapper.selectByPrimaryKey(id);
    }


    public List<T> findByWhere(T t) {
        return mapper.select(t);
    }


    public PageResult findPage(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        List<T> list = mapper.select(null);
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        return  new PageResult(pageInfo.getTotal(), pageInfo.getList());
    }


    public PageResult findPage(Integer page, Integer rows, T t) {
        PageHelper.startPage(page, rows);
        List<T> list = mapper.select(t);
        PageInfo<T> pageInfo = new PageInfo<T>(list);

        return new PageResult(pageInfo.getTotal(), pageInfo.getList());
    }


    public void add(T t) {
        mapper.insertSelective(t);
    }


    public void update(T t) {
        mapper.updateByPrimaryKeySelective(t);

    }


    public void deleteByIds(Serializable[] ids) {
        if (ids != null && ids.length > 0) {
            for (Serializable id : ids) {
                mapper.deleteByPrimaryKey(id);
            }
        }
    }
}

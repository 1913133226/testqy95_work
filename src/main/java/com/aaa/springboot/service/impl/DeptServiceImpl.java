package com.aaa.springboot.service.impl;

import com.aaa.springboot.dao.DeptDao;
import com.aaa.springboot.entity.Dept;
import com.aaa.springboot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
/**
 * 部门管理 service实现
 */
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public List<Dept> listAll() {
        return deptDao.listAll();
    }


    @Override
    public Dept findById(Dept dept) {
        return deptDao.findById(dept);
    }

    @Override
    public int save(Dept dept) {
        return deptDao.save(dept);
    }

    @Override
    public int delete(Long deptno) {
        return deptDao.delete(deptno);
    }

    @Override
    public int update(Dept dept) {
        return deptDao.update(dept);
    }
}

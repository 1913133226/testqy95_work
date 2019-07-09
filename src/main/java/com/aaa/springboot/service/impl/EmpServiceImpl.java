package com.aaa.springboot.service.impl;

import com.aaa.springboot.dao.EmpDao;
import com.aaa.springboot.entity.Emp;
import com.aaa.springboot.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;
    @Override
    public List<Emp> listAll() {
        return empDao.listAll();
    }

    @Override
    public Emp findById(Emp emp) {
        return empDao.findById(emp);
    }

    @Override
    public int save(Emp emp) {
        return empDao.save(emp);
    }

    @Override
    public int delete(Emp emp) {
        return empDao.delete(emp);
    }

    @Override
    public int update(Emp emp) {
        return empDao.update(emp);
    }
}

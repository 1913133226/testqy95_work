package com.aaa.springboot.service;

import com.aaa.springboot.entity.Dept;

import java.util.List;

/**
 * 部门管理service 接口
 */
public interface DeptService {
    /**
     * 查询所有部门信息
     * @return
     */
    public List<Dept>  listAll();

    public Dept  findById (Dept dept);


    public int  save(Dept dept);
    public int  delete(Long deptno);
    public  int  update(Dept dept);



}

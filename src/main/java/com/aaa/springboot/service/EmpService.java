package com.aaa.springboot.service;

import com.aaa.springboot.entity.Emp;

import java.util.List;

public interface EmpService {
    /**
     * 查询所有员工
     * @return
     */
    public List<Emp> listAll();

    /**
     * 根据ID查询员工
     * @return
     */
    public Emp findById(Emp emp);

    /**
     * 添加员工
     * @param emp
     * @return
     */
    public  int save(Emp emp);

    /**
     * 删除员工
     * @param emp
     * @return
     */
    public int delete(Emp emp);

    /**
     * 修改员工
     * @param emp
     * @return
     */
    public int update(Emp emp);
}

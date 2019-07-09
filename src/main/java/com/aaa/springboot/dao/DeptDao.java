package com.aaa.springboot.dao;

import com.aaa.springboot.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Retention;
import java.util.List;

/**
 * 部门管理dao接口
 */
@Repository
@Mapper
public interface DeptDao {
    /**
     * 查询所有部门信息
     * @return
     */
    public List<Dept> listAll();

    /**
     * 根据ID查询信息
     * @param dept
     * @return
     */
    public Dept  findById (Dept dept);


    public int  save(Dept dept);
    public int  delete(Long deptno);
    public  int  update(Dept dept);





}

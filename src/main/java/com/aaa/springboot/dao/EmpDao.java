package com.aaa.springboot.dao;

import com.aaa.springboot.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface EmpDao {
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

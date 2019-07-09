package com.aaa.springboot.entity;

import java.util.Date;

public class Emp {
    private Long  empno;
    private String ename;
    private String job;
    private int  mgr;
    private Date  hierdate;
    private int  sal;
    private int comm;

    public Long getEmpno() {
        return empno;
    }

    public void setEmpno(Long empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public Date getHierdate() {
        return hierdate;
    }

    public void setHierdate(Date hierdate) {
        this.hierdate = hierdate;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getComm() {
        return comm;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }
}

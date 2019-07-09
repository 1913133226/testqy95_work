package com.aaa.springboot.controller;

import com.aaa.springboot.entity.Dept;
import com.aaa.springboot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.security.pkcs11.Secmod;

import java.util.List;


/**
 * 部门管理控制器
 */
@Controller
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Dept> depts = deptService.listAll();
        model.addAttribute("depts",depts);
        return "list";
    }

    /**
     * 跳转到添加页面
     * @return
     */
    @RequestMapping("/edit")
    public String  edit(Dept deptno, Model model){
        if(deptno!=null) {
            Dept byId = deptService.findById(deptno);
            model.addAttribute("byId",byId);

        }
    return  "edit";
    }
    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Dept dept){
          if(dept.getDeptno()!=null){
              deptService.update(dept);
          }else {
              deptService.save(dept);
          }
        return  "redirect:/list";
    }
    @RequestMapping("/delete")
    public String  delete(Long deptno){
        deptService.delete(deptno);
        return "redirect:list";
    }

}

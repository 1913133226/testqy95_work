package com.aaa.springboot.controller;

import com.aaa.springboot.entity.Emp;
import com.aaa.springboot.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 员工管理控制层
 */
@Controller
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping("index")
    public String list(Model model){
        List<Emp> emps = empService.listAll();
        model.addAttribute("emps",emps);
        return "index";
    }
    @RequestMapping("xiougai")
    public String  xiougai(Emp empno,Model model){
       if(empno!=null){
           Emp byId = empService.findById(empno);
           model.addAttribute("byId",byId);
       }
       return "xiougai";

    }
    @RequestMapping("saveUpdate")
    public String saveUpdate(Emp emp){
        if(emp.getEmpno()!=null){
            empService.update(emp);
        }else{
            empService.save(emp);
        }
        return  "redirect:idenx";
    }
    @RequestMapping("delete")
    public String delete(Emp empno){
        empService.delete(empno);
        return "redirect:index";
    }
}

package com.scq.testforjenkins.controller;

import com.scq.testforjenkins.service.StudentService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Write class comments here
 * *
 * User: scq
 * Date: 2019/12/3 16:04
 * version $Id: StudentController.java, v 0.1 Exp $
 */
@RestController
@RequestMapping("/student/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("findById")
    public String findById(Long id){
        return studentService.findById(id).toString();
    }
}

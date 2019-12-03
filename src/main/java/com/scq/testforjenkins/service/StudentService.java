package com.scq.testforjenkins.service;

import com.scq.testforjenkins.entity.Student;

import java.util.List;

/**
 * Write class comments here
 * *
 * User: scq
 * Date: 2019/12/3 16:06
 * version $Id: StudentService.java, v 0.1 Exp $
 */
public interface StudentService {
    List<Student> findById(Long id);
}

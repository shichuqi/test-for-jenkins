package com.scq.testforjenkins.service.impl;

import com.scq.testforjenkins.dao.StudentDao;
import com.scq.testforjenkins.entity.Student;
import com.scq.testforjenkins.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Write class comments here
 * *
 * User: scq
 * Date: 2019/12/3 16:07
 * version $Id: StudentServiceImpl.java, v 0.1 Exp $
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public List<Student> findById(Long id) {
        return studentDao.findById(id);
    }
}

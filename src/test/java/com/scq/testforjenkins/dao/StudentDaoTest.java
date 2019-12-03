package com.scq.testforjenkins.dao;

import com.scq.testforjenkins.entity.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Write class comments here
 * *
 * User: scq
 * Date: 2019/12/3 15:49
 * version $Id: StudentDaoTest.java, v 0.1 Exp $
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class StudentDaoTest {

    @Resource
    private StudentDao studentDao;

    @Test
    @Transactional
    @Rollback(false)
    public void testSave(){
        Student student = new Student();
        student.setName("校长");
        student.setAge(18);
        student.setGender((byte)1);
        studentDao.save(student);
    }
}
package com.scq.testforjenkins.entity;

import lombok.Data;

/**
 * Write class comments here
 * *
 * User: scq
 * Date: 2019/12/3 15:14
 * version $Id: Student.java, v 0.1 Exp $
 */
@Data
public class Student {
    private Long id;
    private String name;
    private Integer age;
    private Byte gender;
}

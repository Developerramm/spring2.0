package com.app.proj45_springboot_layeredapp_springcore.student.dao;

import com.app.proj45_springboot_layeredapp_springcore.student.entity.StudentEntity;

public interface StudentDao {

    public int saveStudent(StudentEntity entity) throws Exception;

}

package com.app.proj45_springboot_layeredapp_springcore.student.service;

import com.app.proj45_springboot_layeredapp_springcore.student.dto.StudentDto;

public interface StudentService {
    public int registerNewStudent(StudentDto dto) throws Exception;
}

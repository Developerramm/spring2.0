package com.app.proj45_springboot_layeredapp_springcore.student.controller;

import com.app.proj45_springboot_layeredapp_springcore.student.dto.StudentDto;
import com.app.proj45_springboot_layeredapp_springcore.student.service.StudentService;
import com.app.proj45_springboot_layeredapp_springcore.student.vo.StudentVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Qualifier;

@Controller("controller")
public class StudentMainController {

    private StudentService studentService;

    @Autowired
    public StudentMainController(@Qualifier("studentService") StudentService studentService) {
        this.studentService = studentService;
    }

    public void registerStudent(StudentVo vo) throws Exception {
        // convert the vo to dto
        StudentDto dto = null;

        dto = new StudentDto();

        dto.setId(Integer.parseInt(vo.getId()));
        dto.setName(vo.getName());
        dto.setEmail(vo.getEmail());
        dto.setCourseName(vo.getCourseName());
        dto.setObtainedMarks(Integer.parseInt(vo.getObtainedMarks()));

        int i = studentService.registerNewStudent(dto);

        if (i > 0) {
            System.out.println("Record saved Successfully");
        } else {
            System.out.println("Record not save");
        }

    }

}

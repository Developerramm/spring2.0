package com.app.proj45_springboot_layeredapp_springcore.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.app.proj45_springboot_layeredapp_springcore.student.dao.StudentDao;
import com.app.proj45_springboot_layeredapp_springcore.student.dto.StudentDto;
import com.app.proj45_springboot_layeredapp_springcore.student.entity.StudentEntity;

@Service("studentService")
public final class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    @Autowired
    public StudentServiceImpl(@Qualifier("studentDao") StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int registerNewStudent(StudentDto dto) throws Exception {

        StudentEntity entity = new StudentEntity();

        String grade = null;

        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setCourseName(dto.getCourseName());
        entity.setObtainedMarks(dto.getObtainedMarks());

        // calculate grade
        if (dto.getObtainedMarks() >= 400) {
            grade = "A";
        } else if (dto.getObtainedMarks() >= 350) {
            grade = "B";
        } else if (dto.getObtainedMarks() >= 300) {
            grade = "C";
        } else if (dto.getObtainedMarks() >= 200) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        dto.setGrade(grade);

        entity.setGrade(dto.getGrade());

        int i = studentDao.saveStudent(entity);

        return i;
    }

}

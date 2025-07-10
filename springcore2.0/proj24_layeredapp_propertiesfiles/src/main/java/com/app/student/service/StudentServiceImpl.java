package com.app.student.service;

import com.app.student.dao.StudentDao;
import com.app.student.dto.StudentDto;
import com.app.student.entity.StudentEntity;

public final class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
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

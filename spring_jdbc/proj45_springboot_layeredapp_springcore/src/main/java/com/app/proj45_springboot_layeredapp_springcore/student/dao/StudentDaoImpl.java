package com.app.proj45_springboot_layeredapp_springcore.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.proj45_springboot_layeredapp_springcore.student.entity.StudentEntity;


@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

    private final static String INSERT_STUDENT = "INSERT INTO student_details (id,name,email,course_name,obtained_marks,grade) VALUES (?,?,?,?,?,?)";

    private DataSource dataSource;

    @Autowired
    public StudentDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public int saveStudent(StudentEntity entity) throws Exception {

        // save the student to the database table
        Connection conn = null;
        PreparedStatement pstmt = null;

        conn = dataSource.getConnection();
        pstmt = conn.prepareStatement(INSERT_STUDENT);

        pstmt.setInt(1, entity.getId());
        pstmt.setString(2, entity.getName());
        pstmt.setString(3, entity.getEmail());
        pstmt.setString(4, entity.getCourseName());
        pstmt.setInt(5, entity.getObtainedMarks());
        pstmt.setString(6, entity.getGrade());

        int row = pstmt.executeUpdate();

        return row;
    }

}

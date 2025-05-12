package springcore.dao;

import springcore.entity.StudentEntity;

public interface StudentDao {

    public int saveStudent(StudentEntity entity) throws Exception;
}

package springcore.service;

import springcore.dto.StudentDto;

public interface StudentService {
    public int registerNewStudent(StudentDto dto) throws Exception;
}

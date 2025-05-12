package springcore.service;

import springcore.dao.StudentDao;
import springcore.dto.StudentDto;
import springcore.entity.StudentEntity;

public final class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int registerNewStudent(StudentDto dto) throws Exception {
        StudentEntity entity = null;
        String grade = null;
        entity = new StudentEntity();

        // convert dto to entity
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setCourse_name(dto.getCourse_name());
        entity.setObtained_marks(dto.getObtained_marks());

        // calculate grade
        if (dto.getObtained_marks() >= 400) {
            grade = "A";
        } else if (dto.getObtained_marks() >= 350) {
            grade = "B";
        } else if (dto.getObtained_marks() >= 300) {
            grade = "C";
        } else if (dto.getObtained_marks() >= 200) {
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

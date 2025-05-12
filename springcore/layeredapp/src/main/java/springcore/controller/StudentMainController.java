package springcore.controller;

import springcore.dto.StudentDto;
import springcore.service.StudentService;
import springcore.vo.StudentVo;

public class StudentMainController {
    private StudentService studentService;

    public StudentMainController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void registerStudetnRequest(StudentVo vo) throws Exception {

        // convert the vo to dto
        StudentDto dto = null;
        dto = new StudentDto();
        dto.setId(Integer.parseInt(vo.getId()));
        dto.setName(vo.getName());
        dto.setEmail(vo.getEmail());
        dto.setCourse_name(vo.getCourseName());
        dto.setObtained_marks(Integer.parseInt(vo.getObtMarks()));

        int i = studentService.registerNewStudent(dto);
        if (i > 0) {
            System.out.println("Record saved successfully");
        } else {
            System.out.println("Record not saved");
        }
    }

}

package com.qap2.studentapi.service;

import com.qap2.studentapi.model.Student;
import com.qap2.studentapi.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> updateStudent(Long id, Student newStudentInfo) {
        return studentRepository.findById(id).map(student -> {
            student.setFirstName(newStudentInfo.getFirstName());
            student.setLastName(newStudentInfo.getLastName());
            student.setEmail(newStudentInfo.getEmail());
            student.setProgramName(newStudentInfo.getProgramName());
            student.setSemester(newStudentInfo.getSemester());
            return studentRepository.save(student);
        });
    }

    public boolean deleteStudent(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        }

        return false;
    }
}

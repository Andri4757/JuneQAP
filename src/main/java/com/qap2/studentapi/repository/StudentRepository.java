package com.qap2.studentapi.repository;

import com.qap2.studentapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

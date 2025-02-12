package com.sms.Student.Management.System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.Student.Management.System.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}

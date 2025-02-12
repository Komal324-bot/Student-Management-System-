package com.sms.Student.Management.System.Service;

import java.util.List;

import com.sms.Student.Management.System.Entity.Student;

public interface StudentService {
	List<Student> getAllStudents();

	Student saveStudent(Student student);

	Student getStudentbyID(Long id);

	Student updateStudent(Student student);

	void deleteStudentById(Long id);
}

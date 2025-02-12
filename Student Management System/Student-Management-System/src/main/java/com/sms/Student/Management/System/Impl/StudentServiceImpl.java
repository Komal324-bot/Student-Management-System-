package com.sms.Student.Management.System.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.Student.Management.System.Entity.Student;
import com.sms.Student.Management.System.Repository.StudentRepository;
import com.sms.Student.Management.System.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {

		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public Student getStudentbyID(Long id) {
		return studentRepository.findById(id).get();

	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}
}

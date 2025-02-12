package com.sms.Student.Management.System.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sms.Student.Management.System.Entity.Student;
import com.sms.Student.Management.System.Service.StudentService;

@Controller
public class StudentController {
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

//handle list student
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}

	@GetMapping("/students/new")
	public String createtudent(Model model) {
		// Create a new Student object and add it to the model
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
	}

	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		// Save the student using the service
		studentService.saveStudent(student);
		return "redirect:/students";
	}

	@GetMapping("/students/edit/{id}")
	public String editstudent(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentbyID(id));
		return "edit_student";
	}

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student) {
		// Fetch the existing student from the database
		Student existingStudent = studentService.getStudentbyID(id);

		// Update the properties of the existing student
		existingStudent.setName(student.getName());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setContact(student.getContact());
		existingStudent.setMarks(student.getMarks());

		// Save the updated student
		studentService.updateStudent(existingStudent);

		// Redirect to the list of students
		return "redirect:/students";
	}

//delete
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";

	}
}
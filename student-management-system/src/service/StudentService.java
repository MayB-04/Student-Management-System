package service;

import java.util.List;
import model.Student;
import repository.StudentRepository;

public class StudentService {
    
    private final StudentRepository repository = new StudentRepository();

    public void addStudent(int id, String name, int age){
        repository.addStudent(new Student(id,name,age));
    }
    public void removeStudent(int id){
        repository.removeStudent(id);
    }
    public Student searchStudent(int id){
        return repository.findStudentById(id);
    }
    public List<Student> listStudents(){
        return repository.getAllStudents();
    }
}

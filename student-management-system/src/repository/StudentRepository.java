package repository;

import java.util.ArrayList;
import java.util.List;
import model.Student;

public class StudentRepository {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(int id){
        students.removeIf(student -> student.getID() == id);
    }

    public Student findStudentById(int id){
        for(Student individual : students){
            if(individual.getID() == id){
                return individual;
            }
        }
        return null;
    }

    public List<Student> getAllStudents(){
        return students;
    }
}

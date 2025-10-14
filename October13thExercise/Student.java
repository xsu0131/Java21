package October13thExercise;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student
{
    private int studentid;
    private String department;
    private String subject;

    public Student(int studentid, String department, String subject)
    {
        this.studentid = studentid;
        this.department = department;
        this.subject = subject;
    }

    public int getId()
    {
        return studentid;
    }

    public String getDepartment()
    {
        return department;
    }

    @Override
    public String toString()
    {
        return "Student id:" + studentid + " ,Department:" + department + " ,Subject:" + subject;
    }

    public static void main(String[] args)
    {
        // List of Students with different id's,department and subject
        List<Student> students = List.of(
                new Student(917389, "Computer Science", "Java"),
                new Student(213052, "Computer Science", "Gameplay"),
                new Student(331057, "Biology", "Marine Biology"),
                new Student(419057, "Physics", "Mechanics"),
                new Student(519471, "Mathematics", "Calculus"),
                new Student(649710, "Arts", "Modern Art")
        );

        // intermediate operation
        // group students using stream()
        Map<String, List<Student>> studentsByDepartment = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment));

        // terminal operation
        studentsByDepartment.forEach((dept, subjects) ->
                System.out.println(dept + " -> " + subjects));
    }

}

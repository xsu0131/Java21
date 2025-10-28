package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student>
{
    int age;
    String name;

    public Student(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public String toString()
    {
        return "Student [age" + age + ", name =" + name + "]";
    }

    @Override
    public int compareTo(Student o) {
        if (this.age > o.age)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(25, "Carlos"));
        students.add(new Student(35, "Andres"));
        students.add(new Student(19, "Mina"));
        students.add(new Student(30, "Lola"));
        students.add(new Student(15, "John"));

//        Comparator<Student> std = new Comparator<Student>()
//        {
//            @Override
//            public int compare(Student o1, Student o2)
//            {
//                if (o1.age > o2.age)
//                {
//                    return 1;
//                }
//                else
//                {
//                    return -1;
//                }
//
//            }
//        };
//
//        // sort by last digit
//        Collections.sort(students, std);

        // doesn't work without having Student class implementing Comparable
        Collections.sort(students);

        for (Student s : students)
        {
            System.out.println(s);
        }
//        System.out.println(students);

    }

}

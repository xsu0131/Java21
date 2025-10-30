package OctoberAssesmentQ2;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;
public class EmployeeStream
{
    public static void main(String[] args) {

        // ArrayList to hold employees
        List<Employee> employees = Arrays.asList(
                new Employee(918, "Alice", "CS", 67000, 2023),
                new Employee(517, "Bob", "IT", 80000, 2019),
                new Employee(415, "Charlie", "CS", 78000, 2018),
                new Employee(006, "Franklyn", "Biology", 100000, 2015),
                new Employee(765, "Alan", "Biology", 55000, 2024)
        );

        // 1) get the highest Paid Employee per Department
        // group them by department and then get the highest salaries
        Map<String, Employee> highestPaidByDept = employees.stream()
                .collect(Collectors.toMap(
                        Employee::getDepartment,     // key = department
                        e -> e,            // value = employee
                        (e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2  // keep higher salary
                ));

        System.out.println("Highest Paid Employee per Department:");
        highestPaidByDept.forEach((dept, emp) -> System.out.println(dept + " -> " + emp.getName()));
        System.out.println();

        // 2) print the number of employees joined after 2020
        long joinedAfterY = employees.stream()
                .filter(e -> e.getJoiningYear() > 2020)
                .count();

        System.out.println("Employees joined after 2020: " + joinedAfterY);
        System.out.println();

        // 3) Department -> List employees names
        Map<String, List<String>> deptToNames = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));

        System.out.println("Department -> List employees names");
        deptToNames.forEach((dept, names) ->
                System.out.println(dept + " -> " + names));
    }
}

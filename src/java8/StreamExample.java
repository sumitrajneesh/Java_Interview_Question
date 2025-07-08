//package java8;
//
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//
///*
// * Scenario:
// * You have a list of employees and need to
// * filter those earning more than 50,000, then sort them by salary.
// */
//
///*
// 1. How does Java 8 improve performance with Streams over traditional loops?
// */
//
////class Employee {
////    String name;
////    double salary;
////    Employee(String name, double salary) {
////        this.name = name;
////        this.salary = salary;
////    }
////}
//
//public class StreamExample {
//    public static void main(String[] args) {
//        List<Employee> employees = Arrays.asList(
//                new Employee("Alice", 60000),
//                new Employee("Bob", 45000),
//                new Employee("Charlie", 75000)
//        );
//        List<Employee> filteredEmployees = employees.stream()
//                .filter(emp -> emp.salary > 50000)
//                .sorted(Comparator.comparingDouble(emp -> emp.salary))
//                .collect(Collectors.toList());
//        filteredEmployees.forEach(emp -> System.out.println(emp.name + ": " + emp.salary));
//    }
//}

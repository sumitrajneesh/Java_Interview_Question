package java8;

import java.util.Optional;

class Department {
    String name;
    Department(String name) { this.name = name; }
}
class Employee {
    Optional<Department> department;
    Employee(Department department) {
        this.department = Optional.ofNullable(department);
    }
}

public class OptionalExample {
}

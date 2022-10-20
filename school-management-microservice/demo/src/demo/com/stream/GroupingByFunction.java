package demo.com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import demo.com.entity.Employee;

public class GroupingByFunction {

	public static void main(String[] args) {
		List<Employee> employeesList = new ArrayList<>();
		
		employeesList.add(new Employee(101, "Glady", "Manager", "Male", 2500000));
        employeesList.add(new Employee(102, "Vlad", "Software Engineer", "Female", 1500000));
        employeesList.add(new Employee(103, "Shine", "Lead Engineer", "Female", 2000000));
        employeesList.add(new Employee(104, "Nike", "Manager", "Female", 2500000));
        employeesList.add(new Employee(105, "Slagan", "Software Engineer", "Male", 1500000));
        employeesList.add(new Employee(106, "Murekan", "Software Engineer", "Male", 1500000));
        employeesList.add(new Employee(107, "Gagy", "Software Engineer", "Male", 1500000));
        
        Map<String, Map<Long, Long>> multipleFieldsMap=  employeesList.stream()
        		.collect(Collectors.groupingBy(Employee::getDesignation,Collectors.groupingBy(Employee::getSalary,Collectors.counting())));
        
        System.out.println(multipleFieldsMap);
        

	}

}

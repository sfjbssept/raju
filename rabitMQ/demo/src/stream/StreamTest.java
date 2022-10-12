package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamTest {

	public static void main(String[] args) {
	
		
		List<Integer> number=new ArrayList<Integer>();
		
		number.add(232);
		number.add(12);
		number.add(23);
		number.add(32);
		
		System.out.println(number.stream().sorted().skip(1).findFirst());;
		
		  Department account = new Department("Account", 75); 
	      Department hr = new Department("HR", 50);
	      Department ops = new Department("OP", 25);
	      Department tech = new Department("Tech", 150);
	      
	      List<Employee> employeeList = Arrays.asList(new  Employee("David", 32, "Matara", account), 
                  new  Employee("Brayan", 25, "Galle", hr),
                  new  Employee("JoAnne", 45, "Negombo", ops),
                  new  Employee("Jake", 65, "Galle", hr),
                  new  Employee("Brent", 55, "Matara", hr),
                  new  Employee("Allice", 23, "Matara", ops),
                  new  Employee("Austin", 30, "Negombo", tech),
                  new  Employee("Gerry", 29, "Matara", tech),
                  new  Employee("Scote", 20, "Negombo", ops),
                  new  Employee("Branden", 32, "Matara", account),
                  new  Employee("Iflias", 31, "Galle", hr));
	      
			/*
			 * employeeList.stream().filter(e->e.getCity().equalsIgnoreCase("Matara"))
			 * .sorted(Comparator.comparing(Employee::getName)) .forEach(e->
			 * System.out.println(e.getName()));
			 */
	      
	      
	      //employeeList.stream().map(e->e.getDepartment().getDepartmentName()).distinct().forEach(System.out::println);
	      
			/*
			 * employeeList.stream() .map(Employee::getDepartment) .filter(d->
			 * d.getNoOfEmployees()>50)
			 * .forEach(d->System.out.println(d.getDepartmentName()));
			 */
	      
			/*
			 * String s= employeeList.stream()
			 * .map(e->e.getDepartment().getDepartmentName()) .distinct() .reduce("",
			 * (a,b)-> a+"--"+b); System.out.println(s);
			 */
	      
			/*
			 * employeeList.stream()
			 * .filter(e->e.getDepartment().getDepartmentName().equalsIgnoreCase("Account"))
			 * .map(e->e.getName()) .forEach(System.out::println);
			 */
	      
			/*
			 * employeeList.stream() .map(e->e.getDepartment().getNoOfEmployees())
			 * .reduce(Integer::max) .ifPresent(System.out::println);
			 */
	      
	      employeeList.stream().map(Employee::getDepartment)
	      .reduce((d1,d2)->d1.getNoOfEmployees() > d2.getNoOfEmployees()?d1:d2)
	      .ifPresent(d->System.out.println(d.getDepartmentName()));
	      

	}

}

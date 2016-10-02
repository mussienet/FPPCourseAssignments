package prob1;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;


public class Employee {
	private String firstName, lastName;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String fName, String lName, double aSalary, 
			int aYear, int aMonth, int aDay) {
		firstName = fName;
		lastName = lName;
		salary = aSalary;
		hireDay = LocalDate.of(aYear,  aMonth, aDay);
	}

	// instance methods
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Employee)) return false;
		Employee e = (Employee)ob;
		return e.firstName.equals(firstName) 
				&& e.lastName.equals(lastName)
				&& e.hireDay.equals(hireDay)
				&& e.salary == salary;
	}
	
}

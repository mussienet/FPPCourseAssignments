package prob1;

import java.awt.EventQueue;

import prob1.sampleUI.TableSample;

public class Main {
	static Employee[] emps = new Employee[10];
	public static void main(String[] args) {
		loadEmps();
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				TableSample ts = new TableSample();
				ts.loadData(Util.convert(emps));
				ts.setVisible(true);
			}
		});
	}
		
	public static void loadEmps() {
		emps[0] = new Employee("Jim", "Daley", 200000, 2000, 9, 4);
		emps[1] = new Employee("Bob", "Reuben", 150000, 1998, 1, 5);
		emps[2] = new Employee("Susan", "Randolph", 120000, 1997, 2,13);	
		emps[3] = new Employee("Tom", "Thomas", 120000, 2000, 9, 14);
		emps[4] = new Employee("Rick", "Venus", 130000, 1998, 4, 9);
		emps[5] = new Employee("Harry", "Disney", 99000, 2011, 2,13);	
		emps[6] = new Employee("Jennifer", "Lee", 99000, 2005, 9, 4);
		emps[7] = new Employee("Orlando", "Thompson", 75000, 2001, 3, 15);
		emps[8] = new Employee("Thorafax", "Monty", 110000, 2007, 5,17);	
		emps[9] = new Employee("Manny", "Davis", 110000, 2010, 7, 4);
		
	}
}

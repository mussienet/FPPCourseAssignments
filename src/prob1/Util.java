package prob1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Util {
	public static String[][] convert(Employee[] list) {
		String[][] ret = new String[list.length][4];
		for(int i = 0; i < list.length; ++i) {
			ret[i][0] = list[i].getFirstName();
			ret[i][1] = list[i].getLastName();
			ret[i][2] = list[i].getHireDay().format(DateTimeFormatter.ISO_DATE);
			ret[i][3] = (new Double(list[i].getSalary())).toString();
		}
		return ret;
	}
	
	public static Employee[] convert(String[][] data) {
		Employee[] emps = new Employee[data.length];
		for(int i = 0; i < data.length; ++i) {
			LocalDate d = LocalDate.parse(data[i][2], DateTimeFormatter.ISO_DATE);
			emps[i] = new Employee(data[i][0], data[i][1], Double.parseDouble(data[i][3]), d.getYear(), d.getMonthValue(), d.getDayOfMonth());
		}
		return emps;
	}
	
}

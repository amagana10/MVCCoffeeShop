
public class EmployeeController {
	public String getEmployeeName(Employee employee) {
		return employee.getName();
	}
	public void setEmployeeName(Employee employee, String name) {
		employee.setName(name);
	}
	public int getEmployeeNumber(Employee employee) {
		return employee.getNumber();
	}
	public void setEmployeeNumber(Employee employee, int number) {
		employee.setNumber(number);
	}
	public String getEmployeeJobTittle(Employee employee) {
		return employee.getJobTitle();
	}
	public void setEmployeeJobTitle(Employee employee, String title) {
		employee.setJobTitle(title);
	}
	public int getEmployeeSalare(Employee employee) {
		return employee.getSalary();
	}
	public void setEmployeeSalary(Employee employee, int salary) {
		employee.setSalary(salary);
	}
}

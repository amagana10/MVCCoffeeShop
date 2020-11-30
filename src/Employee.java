import java.util.*;

public class Employee implements Subject{
	private String name;
	private int number;
	private String jobTitle;
	private int salary;
	private ArrayList<Observer> observers;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public void registerObservers(Observer fan) {
		// TODO Auto-generated method stub
		this.observers.add(fan);
	}
	@Override
	public void removeObservers(Observer fan) {
		// TODO Auto-generated method stub
		this.observers.remove(fan);
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer ob:this.observers) {
			ob.update("");
		}
	}
}

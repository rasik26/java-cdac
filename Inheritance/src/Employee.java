import java.time.LocalDate;

abstract public class Employee extends Person {
	private String dept;
	private String desg;
	private LocalDate doj;
	public Employee() {
		super();
	}
	public Employee(int pid, String name,String mobile,String email,String dept,String desg,LocalDate doj) {
		super(pid,name,mobile,email);
		this.dept = dept;
		this.desg=desg;
		this.doj = doj;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg=desg;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public double calculateSal() {
		System.out.println("inside calculate");
		return 0;
	}
	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", desg=" + desg + ", doj=" + doj + "]";
	}
	
	
	

}

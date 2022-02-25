public class Employee extends Person{
	private double annual_salary;
	private int emp_yr;
	private String insurance_no;

	public Employee(String n,double a,int y,String i){
		super(n);
		annual_salary=a;
		emp_yr=y;
		insurance_no=i;
	}
	public void setSalary(double a){
		annual_salary=a;
	}
	public void setYear(int y){
		emp_yr=y;
	}
	public void setInsurance_no(String i){
		insurance_no=i;
	}
	public double getSalary(){
		return annual_salary;
	}
	public int getYear(){
		return emp_yr;
	}
	public String getInsurance_no(){
		return insurance_no;
	}
	public String toString(){
		return super.toString()+""+annual_salary+""+emp_yr+""+insurance_no;
	}
}
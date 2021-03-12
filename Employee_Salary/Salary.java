public class Salary extends Employee {
    private double ySalary;
    public Salary(String name, String ssNum, double ySalary){
        super(name, ssNum);
        this.ySalary = ySalary;
    }
    public double getSalary(){
        return (ySalary/12);
    }
}
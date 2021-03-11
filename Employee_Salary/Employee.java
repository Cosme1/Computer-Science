public abstract class Employee {
    private String name;
    private String ssNum;

    public Employee(String n, String s){
        name = n;
        ssNum = s;
    }

    public String getName(){
        return name;
    }

    public String getSSNUM(){
        return ssNum;
    }

    public abstract double getSalary();
}
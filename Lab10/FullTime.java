package Lab10;


/**
 * Write a description of class FullTime here.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com 
 * @version (a version number or a date)
 */
public class FullTime extends Employee
{
    public double salary;
    public FullTime(){
    }
    public FullTime(String name, String idNum, int hireYear, double salary){ 
        super(name,idNum,hireYear);
        setSalary(salary);
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public String toString(){
      String tsft = super.toString() + String.format("Salary: $%,.2f\n", salary);
      return tsft;
    }
}
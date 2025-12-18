package Lab10;


/**
 * Write a description of class Adjunct here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Adjunct extends Employee
{
    public double hours;
    public double hrRate;
    public Adjunct(String name, String idNum, int hireYear, double hours, double hrRate){ 
      super(name,idNum,hireYear);
      this.hours = hours;
      this.hrRate = hrRate;
    }
    public double getSalary(){
      return hours*hrRate;
    }
    public String toString(){
      String tsadj = super.toString() + "Hours: " + hours + ", Hourly Rate: " + hrRate + ", Salary: " + getSalary() + "\n"; 
      return tsadj;
    }
}
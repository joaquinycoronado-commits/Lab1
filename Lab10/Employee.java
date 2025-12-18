package Lab10;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee extends Person
{
   private int hireYear;
   private String idNum;
   public Employee(){
       super();
       hireYear = 0;
       idNum = "Onboarding";
   }
   public Employee(String name, String idNum, int hireYear){ 
       super(name);
       this.idNum = idNum;
       this.hireYear = hireYear;
   }
   public boolean equals(Object o){
       boolean isEqual = false;
       if(o != null && getClass()==o.getClass()){
           Employee copy = (Employee)o;
           if(idNum.equalsIgnoreCase(copy.idNum))
               isEqual = true;
       }
       return isEqual;
   }
   public int getServiceYears(){
       return CURRENT_YEAR - hireYear;
   }
   public int getHireDate(){
       return this.hireYear;
   }
   public String getidNum(){
       return this.idNum;
   }
   public void setHireYear(int hireYear){
       this.hireYear = hireYear;
   }
   public void setidNum(String idNum){
       this.idNum = idNum;
   }
   public String toString(){
       String tsemp = super.toString() + "ID Number: " + idNum + "\nYear Hired: "+ hireYear + ", Years of Service: " + getServiceYears() + "\n";
       return tsemp;
   }
}
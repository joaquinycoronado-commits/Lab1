package Lab10;


/**
 * Write a description of class HRDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HRDemo{
    public static void main(String[] args){
        int index = 1;
        FullTime fred = new FullTime("Flintstone, Fred", "BR-1", 2013, 75000.1234);
        Adjunct barney = new Adjunct("Rubble, Barney", "BR-2", 2014, 320, 60.55);
        Employee betty = new Employee("Rubble, Betty", "BR-4", 2020);
        FullTime wilma = new FullTime();
        FullTime wilma2 = new FullTime("Flintstone, Wilma", "BR-3", 2016, 78123.2468);
        
        wilma.setName("Flintstone, Wilma");
        wilma.setidNum("BR-3");
        wilma.setHireYear(2016);
        wilma.setSalary(78123.2468);
        
        Person[] staff = {barney,betty,fred,wilma,wilma2};
        
        for(Person staffobj : staff){
        System.out.printf("Employee" + index + "\n" + staffobj + "\n");
        index++;
        }
        System.out.printf("wilma and wilma2 are the same person: " + wilma.equals(wilma2) + "\n\n");
        wilma.setName("Slate, Wilma");
        index = 1;
        
        Person[] staff2 = {fred, barney, wilma, betty};
        for(Person staffobj : staff2){
        System.out.println("Employee" + index + "\n" + staffobj + "\n");
        index++;
        }
    }
}


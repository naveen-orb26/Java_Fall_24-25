class Employee{
    float salary= 40000;
  
}
class Inherit1 extends Employee {
    int bonus = 10000;
   
    public static void main(String args[]) {
        Inherit1 p = new Inherit1();
        System.out.println(("Programmer salary: "+ p.salary + "\nProgrammer bonus: "+ p.bonus));
         }
}

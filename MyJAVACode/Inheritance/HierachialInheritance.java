import static java.lang.System.out;
class Employee
{
    double salary;
    Employee()
    {
        this.salary=50000;
    }
}
class ParmanentEmployee extends Employee
{
    double hike=0.50;
    ParmanentEmployee()
    {
        super();
        this.hike=0.50;
    }
    void salary()
    {
        salary=salary+(salary*hike);
        out.println("Salary of Parmanent Employee: "+salary);
    }
}
class InternEmployee extends Employee
{
    double hike;
    InternEmployee()
    {
        super();
        this.hike=0.25;
    }
    void salary()
    {
        salary=salary+(salary*hike);
        out.println("Salary of Intern Employee: "+salary);
    }
}
class HierachialInheritance
{
    public static void main(String[] args)
    {
        ParmanentEmployee PE = new ParmanentEmployee();
        InternEmployee IE = new InternEmployee();

        PE.salary();
        IE.salary();
    }
}
import workerPk.Worker;
import wagesPk.Wages;
class CalDailyWage extends Worker implements Wages
{
    double pay;
    
    CalDailyWage(int id,String name)
    {
        super(id,name);
    }
    
    public double calculatePay(int hours, double rate)
    {
        if (hours > 8)
        {
            int extra_hours = hours-8;
            pay = (8 * rate) + (extra_hours * rate);
        }
        else
            pay = 8 * rate;
        return pay;
    }

    public void displaySalary()
    {
        System.out.println("Salary: "+pay);
    }

    public static void main(String[] args)
    {
        CalDailyWage c = new CalDailyWage(101,"Moni Sen");

        
        c.displayWorker();

        c.calculatePay(40, 2);
        c.displaySalary();
    }
}
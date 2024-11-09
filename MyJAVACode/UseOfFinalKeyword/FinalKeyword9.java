class A
{
    final void fin_fun1()
    {
        System.out.println("Final method fin_fun1() of super class");
    }
}
class FinalKeyword9 extends A
{
    @Override
    void fin_fun1() //final method the super class can't be overriden
    {
        System.out.println("Final method fin_fun1() of child class");
    }
    public static void main(String [] args)
    {
        FinalKeyword9 obj = new FinalKeyword9();
        obj.fin_fun1();
    }
}

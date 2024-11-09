//when Final Variable is a reference (array)
package Problem;
class A
{
    int age;
    A(int age)
    {
        this.age=age;
    }
    void display()
    {
        System.out.println("Age: "+this.age);
    }
}
class FinalKeyword2
{
    public static void  main(String [] args)
    {
        //If the final variable is a reference, this means that the variable 
        //cannot be re-bound to reference another object, but the internal 
        //state of the object pointed by that reference variable can be 
        //changed i.e. you can add or remove elements from the 
        //final array or final collection.
        final A [] obj ={new A(25),new A(24),new A(23)};

        for (A i:obj)
            i.display();
    }
}
class A
{
    String s1="A.s1";
    String s2="A.s2";
}
class B extends A
{
    String s1="B.s1";
}
class Test4
{
    public static void main(String[] args) {
        B b1 = new B();
        A a1 = b1;
        System.out.println(a1.s1+""+a1.s2);
    }
}

class Test 
{
    int x;
    Test(int x)
    {
        this.x=x;
    }
	void display()
	{
		// calling function show()
		this.show();
	    System.out.println("Inside display function: x="+x);
	}
	
	void show() 
    {
		System.out.println("Inside show function: x="+x);
	}
	

	public static void main(String args[]) {
		Test t1 = new Test(10);
		t1.display();

        Test t2 = new Test(20);
		t2.display();
	}
}

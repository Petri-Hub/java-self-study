class TestingInitializationProccess {
	private int number = 10;

	{
		System.out.println("The number currently is: " + number);
	}

	{
		System.out.println("This is another standard block");
	}

	public TestingInitializationProccess(){
		System.out.println("The number value in constructor is: " + number);
	}

	{
		number = 25;
	}

	{
		System.out.println("Another test console");
	}

	public static void main(String[] args){
		new TestingInitializationProccess();
	}
}

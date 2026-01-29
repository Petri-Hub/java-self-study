class TestingUndefinedInstanceMembers {
	static byte byteValue;
	static short shortValue;
	static int intValue;
	static long longValue;
	static float floatValue;
	static double doubleValue;
	static char charValue;
	static boolean booleanValue;

	private byte byteValue2;
	private short shortValue2;
	private int intValue2;
	private long longValue2;
	private float floatValue2;
	private double doubleValue2;
	private char charValue2;
	private boolean booleanValue2;

	public static void main(String[] args){
		System.out.println("Static testing...");
		System.out.println(byteValue);
		System.out.println(shortValue);
		System.out.println(intValue);
		System.out.println(longValue);
		System.out.println(floatValue);
		System.out.println(doubleValue);
		System.out.println(charValue);
		System.out.println(booleanValue);
		
		System.out.println("Instance testing...");
		var t = new TestingUndefinedInstanceMembers();

		System.out.println(t.byteValue2);
		System.out.println(t.shortValue2);
		System.out.println(t.intValue2);
		System.out.println(t.longValue2);
		System.out.println(t.floatValue2);
		System.out.println(t.doubleValue2);
		System.out.println(t.charValue2);
		System.out.println(t.booleanValue2);
	}
}

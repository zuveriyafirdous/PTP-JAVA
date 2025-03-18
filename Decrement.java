class Decrement{
	public static void main(String...args)
	{
		int a = 20;
		System.out.println(--a + a);
		//pre Decrement
		System.out.println(a--+a);
		//summation without method
		a = 20;
		System.out.println(Integer.sum(--a,a));
	}
}
class UnaryDemo{
	public static void main(String...args)
	{
		int a = 10;
		System.out.println(++a + a);
		a=10;
		System.out.println(a+++a);
		a=10;
		System.out.println(Integer.sum(++a,a));
	}
}
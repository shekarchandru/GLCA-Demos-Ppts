class Singleton
{
	private static Singleton singleton = new Singleton();

	private Singleton(){}

	public static Singleton getInstance()
	{
		return singleton;
	}

	protected static void demoMethod()
	{
		System.out.println("Demo Method");
	}
}
public class SingletonDemo2
{
	public static void main(String[] args)
	{
		Singleton tSingle = Singleton.getInstance();
		tSingle.demoMethod();
	}

}
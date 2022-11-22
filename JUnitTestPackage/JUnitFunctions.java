package JUnitTestPackage;
public class JUnitFunctions 
{
	int AddNumbers(int x, int y)
	{
        int sum = x + y;
        System.out.println("Sum of Two Numbers are: ");
        return sum;
	}
	String AddStrings(String x, String y)
	{
		String sum = x.concat(y);
		System.out.println("Sum of Two Strings are: ");
		return sum;
	}
}

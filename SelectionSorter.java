

public class SelectionSorter 
{
//sorts an array @param double array
public static void sort(double[] a)
{
	for(int i = 0; i < a.length - 1; i++)
	{
		int index = i;
		for(int j = i + 1; j < a.length; j++)
		{
			index = j;
		}
	}
}
/*
 * this method will swap min value
 * @param double array, int i(position),int j(value holder) 
 */
public static void swap(double[] a, int i, int j)
{
	double temp = a[i];
	a[i] = a[j];
	a[j] = temp;
}
}

package exceptionHandling;

public class ArrayindexoutofBounds {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3};
		try {
		System.out.println(arr[3]);

	}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array of index 3 not exists");
		}

}
}

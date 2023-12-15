package scripts;

public class ForEachLoop {

	public static void main(String[] args) throws InterruptedException {
		
		int[] arr= {1,2,3,4,5};
		
		for(int x:arr) 
		{
			System.out.println(x);
			Thread.sleep(2000);
		}
	}
}
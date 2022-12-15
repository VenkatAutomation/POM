package HRM.Config2;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {11, 21, 8, 9, 32, 32, 5, 15, 20, 19};
		
		for(int i =0; i<arr.length;i++) 
		{
		for(int j = i+1;j<arr.length;j++) 
		{
		if(arr[i]>=arr[j])
		{
			System.out.println(arr[i]);
		}	
		}
			
		}
		
		
		
	}

}

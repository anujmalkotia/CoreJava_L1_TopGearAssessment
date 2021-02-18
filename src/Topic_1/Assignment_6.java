package Topic_1;

public class Assignment_6 {

	public static void main(String[] args) {
		 int arr[] = {72,99,873,12,9999};
         int max = arr[0]; 
         for (int i = 1; i < arr.length; i++) 
             if (arr[i] > max) 
                 max = arr[i]; 
        
         System.out.println(max); 

	}

}

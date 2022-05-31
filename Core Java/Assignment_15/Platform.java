package Assignment_15;

public class Platform {

	   
    public static int findPlatform(double[] arr, double[] dep, int n)
    {
 
 	    int plat_needed = 1, result = 1;
        int i = 1, j = 0;
 
        
        for (i = 0; i < n; i++) {
            
            plat_needed = 1;
 
            for (j = i + 1; j < n; j++) {
               
                if ((arr[i] >= arr[j] && arr[i] <= dep[j]) || (arr[j] >= arr[i] && arr[j] <= dep[i]))
                    plat_needed++;
            }
 
           
            result = Math.max(result, plat_needed);
        }
 
        return result;
    }
 
    
    public static void main(String[] args)
    {
        double arr[] = { 9.00, 9.40, 9.50, 11.00, 15.00, 18.00 };
        double dep[] = { 9.10, 12.00, 11.20, 11.30, 19.00, 20.00 };
        int n = 6;
        System.out.println(
            "Minimum Number of Platforms Required = " + findPlatform(arr, dep, n));
    }
}

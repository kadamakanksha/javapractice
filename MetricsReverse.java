public class MetricsReverse{
    public static void main(String args[]){

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

int i,j;


    System.out.println("printing  values of metrics: \n");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			System.out.print(" "+arr[i][j]);
		}
			System.out.println("\n");
	} 
	System.out.println("Reverse of metrics: \n");

	for(i=2;i>=0;i--){
		
		for(j=2;j>=0;j--){
		System.out.print(" "+arr[i][j]);
		}
		System.out.println("\n");
	}

    }
}
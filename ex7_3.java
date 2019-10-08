import java.util.Scanner;
public class ex7_3 {

 	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	System.out.print("Enter the integers between 1 and 100: ");
	int [] numbers = new int[101];
	int a=1;
	while(a>0){
		 a = input.nextInt();
	    	numbers[a]+=1;
	    	if(a==0){
	    		break;
	    	}
	}
	for(int i=1;i<101;i++){
		if(numbers[i]==1){
			System.out.println(i + " occurs " + numbers[i] + " time");
		}
		if(numbers[i]>1){
			System.out.println(i + " occurs " + numbers[i] + " times");
		}
	}
	
		
   }
}
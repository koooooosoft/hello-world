import java.util.Scanner;
public class huiy {

 	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	System.out.print("Enter 10 numbers: ");
	int [] numbers = new int[10];
	int a;
	int flag=0;
	int total=0;
	for(int i=0;i<10;i++){
		 a = input.nextInt();
		 for(int j=0;j<10;j++){
			 if(a==numbers[j]){ 
				 flag=1;
			 }
		 }
	    if(flag==0){
	    	numbers[i]=a;}
	    flag=0;
	  }
	for(int i=0;i<10;i++){
		if(numbers[i] > 0) {
			total+=1;
		}
	}
	System.out.println("The number of distinct numbers is " + total);
	System.out.print("The  distinct numbers are " );
	for(int i=0;i<10;i++){
		if(numbers[i]>0){
			System.out.print(numbers[i]+" ");
			}
	}
		
   }
}
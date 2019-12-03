
import java.util.Scanner;

public class ex9_13 {
	public int row,column;
    public double maxValue;
    public static Location locateLargest(double[][] a){
        Location my=new Location();
        my.maxValue=a[0][0];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]>my.maxValue){
                    my.maxValue=a[i][j];
                    my.row=i;
                    my.column=j;
                }
            }
        }
        return my;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
	        System.out.print("Enter the number of rows and columns in the array: ");
	        int r=input.nextInt(),c=input.nextInt();
	        System.out.println("Enter the array: ");
	        double array[][]=new double[r][c];
	        for(int i=0;i<r;i++)
	            for(int j=0;j<c;j++)
	                array[i][j]=input.nextDouble();
	        Location my=Location.locateLargest(array);
	        System.out.print("The location of the largest element is "+my.maxValue+" at ("+my.row+"£¬"+my.column+")");
	}

}
class Location{
	public int row=0;
	public int column=0;
	public double maxValue;
}

package ex9;

public class ex9_9 {

	public static void main(String[] args) {
		RegularPolygon r1 = new RegularPolygon();
		System.out.println("����һ�ܳ�: " + r1.getPerimeter() + " ���: " + r1.getArea());
        
		RegularPolygon r2 = new RegularPolygon(6,4);
		System.out.println("����һ�ܳ�: " + r2.getPerimeter() + " ���: " + r2.getArea());

		RegularPolygon r3 = new RegularPolygon(10,4,5.6,7.8);
		System.out.println("����һ�ܳ�: " + r3.getPerimeter() + " ���: " + r3.getArea());

	}

}

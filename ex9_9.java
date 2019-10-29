package ex9;

public class ex9_9 {

	public static void main(String[] args) {
		RegularPolygon r1 = new RegularPolygon();
		System.out.println("对象一周长: " + r1.getPerimeter() + " 面积: " + r1.getArea());
        
		RegularPolygon r2 = new RegularPolygon(6,4);
		System.out.println("对象一周长: " + r2.getPerimeter() + " 面积: " + r2.getArea());

		RegularPolygon r3 = new RegularPolygon(10,4,5.6,7.8);
		System.out.println("对象一周长: " + r3.getPerimeter() + " 面积: " + r3.getArea());

	}

}

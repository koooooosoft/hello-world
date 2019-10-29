package ex9;

public class RegularPolygon {
      //�������α�����Ĭ��ֵΪ3
	private int n=3;
	  //�洢�ߵĳ��ȣ�Ĭ��ֵΪΪ1
	private double side=1;
	  //���������е������x��Ĭ��ֵΪ0��
	private double x=0;
	  //���������е������y��Ĭ��ֵΪ0��
	private double y=0;
	
public RegularPolygon(){}

public RegularPolygon(int newN,double newS){
	n=newN;
	side=newS;
	x=0;
	y=0;
}
public RegularPolygon(int newN,double newS,double newX,double newY){
	n=newN;
	side=newS;
	x=newX;
	y=newY;
}	
public void setN(int newN){
	n=newN;
}
public void setSide(double newS){
	side=newS;
}
public void setX(double newX){
	x=newX;
}
public void setY(double newY){
	y=newY;
}
public int getN(){
	return n;
}
public double getSide(){
	return side;
}
public double getX(){
	return x;
}
public double getY(){
	return y;
}
public double getPerimeter(){
	return n*side;
}
public double getArea(){
	return (n*side*side)/4*Math.tan(3.1415926/n);
}
}

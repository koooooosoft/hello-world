package ex9;

public class RegularPolygon {
      //定义多边形边数，默认值为3
	private int n=3;
	  //存储边的长度，默认值为为1
	private double side=1;
	  //定义多边形中点的坐标x，默认值为0；
	private double x=0;
	  //定义多边形中点的坐标y，默认值为0；
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

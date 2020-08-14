
class Circle{
	private double radius;
	double peri(){
		return (2*Math.PI*radius);
	}
	double are(){
		return (Math.PI*radius*radius);
	}
	void setRadius(double r){
		radius=r;

	}
	double getRadius(){
		return radius;

	}
}

class Demo{
	static void display(Circle s){
		System.out.println("radius is :"+s.getRadius());
	}
	static void sip(Circle t){
		System.out.println("perimeter is:"+t.peri());
		System.out.println("area is:"+t.are());
	}
	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.setRadius(5);
		display(c1);
		sip(c1);
	}


}
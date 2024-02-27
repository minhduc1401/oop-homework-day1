package bai65;

public class main {
	public static void main(String[] args) {
		
		GeometricObject go = new ResizableCircle(5);
		
		System.out.println(go.getPerimeter());
		System.out.println(go.getArea());
	}
}

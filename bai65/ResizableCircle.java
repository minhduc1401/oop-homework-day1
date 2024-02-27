package bai65;

public class ResizableCircle extends Circle implements Resizable {
	
	public ResizableCircle(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "ResizableCircle [Circle[radius="+radius+"]]";
	}

	@Override
	public void resize(int percent) {
		radius *= percent/100.0;	
	}
	
}

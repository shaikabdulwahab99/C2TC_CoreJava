package general;

class Box
{
	float width;
	float height;
	float depth;
	
	float calcVol1() {
		return width*height*depth;
	}
}

public class BoxDemo {
	
	public static void main(String[] args) {
		Box box1;
		box1=new Box();
		box1.width=3.4f;
		box1.height=2.2f;
		box1.depth=1.4f;
		float vol1=box1.calcVol1();
		System.out.println("Volume of Box1 is"+vol1);
		
		Box box2;
		box2=new Box();
		box2.width=8.8f;
		box2.height=4.2f;
		box2.depth=8.4f;
		float vol2=box2.calcVol1();
		System.out.println("Volume of Box2 is"+vol2);
		
	}
}

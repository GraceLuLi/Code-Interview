
public class Box {
	int h;
	int w;
	int d;
	Box(int height, int weight, int depth){
		h = height;
		w = weight;
		d = depth;
	}
	boolean canAbove(Box b){
		return (this.h < b.h) && (this.w < b.w) && (this.d < b.d);
	}

}

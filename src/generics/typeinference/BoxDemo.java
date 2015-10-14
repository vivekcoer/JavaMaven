package generics.typeinference;

import java.util.ArrayList;
import java.util.List;

public class BoxDemo {
	public static <U> void addToBox(U u, List<Box<U>> boxes) {
		    Box<U> box = new Box<U>();
		    box.set(u);
			boxes.add(box);
	}

	public static <U> void output(List<Box<U>> boxes) {
		int counter = 0;
		for (Box<U> box : boxes) {
			counter++;
			System.out.println("Box#" + counter + " contains [" + box.get() + "]");
		}
	}
	
	public static void main(String args[]){
		ArrayList<Box<Integer>> boxes = new ArrayList<Box<Integer>>();
		BoxDemo.addToBox(20, boxes);
		//if you do this, it will throw error!  Benefits of Generics and example of inference
		//BoxDemo.addToBox(20.1, boxes);
		BoxDemo.<Integer>addToBox(30, boxes);
		BoxDemo.<Integer>addToBox(Integer.valueOf(30), boxes);
	}
}

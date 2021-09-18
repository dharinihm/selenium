package basics;

import java.util.TreeMap;

public class HashmapDemo {
	public static void main(String[] args) {
//		TreeMap hmap = new TreeMap<>();
//		hmap.put(1,"Dharini");
//		hmap.put(4,"Dhari");
//		hmap.put(5,"hmd");
//		hmap.put(8,"Diva");	
//		hmap.put(null,"Diva");//NullPointerException	
//		hmap.put(0, 78);
//		hmap.put(89,"fruit");
//		hmap.put("dd", 90);//ClassCastExecution
//
//		System.out.println(hmap);
		
		Object[] obj = new Object[4];
		obj[0]= "dharini";
		obj[1] = 90;
		obj[2] = true;
		obj[3] = 'a';
		for(int i = 0; i<obj.length; i++) {
			System.out.println(obj[i]);
		}
		//System.out.println(obj);
	}}

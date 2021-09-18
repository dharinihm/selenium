package basics;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSeDemo {
	public static void main(String[] args) {
		TreeSet<Object> tset = new TreeSet<>();
		tset.add(24);
		tset.add(89);
		tset.add(56);
		tset.add(78);
		
		System.out.println(tset);
		System.out.println(tset.descendingSet());
	}}

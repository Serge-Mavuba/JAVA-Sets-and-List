package demo.sets.lists;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class listSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> t = new HashSet<Integer>();
		t.add(5);
		t.add(7);
		t.add(5);
		t.add(9);
		t.add(-8);
		
		System.out.println(t);
		System.out.println();
		
		//treeSet (elements are ordered)
		Set<Integer> s = new TreeSet<Integer>();
		s.add(5);
		s.add(7);
		s.add(5);
		s.add(9);
		s.add(-8);
		System.out.println(s);
		System.out.println();
		
		//LISTS
		ArrayList<Integer> u = new ArrayList<Integer>();
		u.add(1);
		u.add(2);
		u.add(1);
		u.add(2);
		u.add(1);
		u.add(2);
		u.get(0);
		u.set(1, 5);
		u.subList(1, 3);
		
		System.out.println(u.subList(1,4));

	}

}

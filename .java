package collections;

import java.util.LinkedHashSet;

//  -------> Maintains insertion order
//---------> No duplicates


// insert the integer
class r{
	static void dispaly() {
		LinkedHashSet<Integer> a=new LinkedHashSet<Integer>();
		a.add(null);
		a.add(null);
		a.add(1);
		a.add(1);   // ----> to check whether they accept the duplicate or not 
		a.add(2);
		a.add(3);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(7);
		a.add(8);
		a.add(8);
		
		System.out.println(a);
	}
	
// insert the string values 	
	static void output() {
		LinkedHashSet<String> a=new LinkedHashSet<String>();
		a.add(null);
		a.add(null);
		a.add("a");
		a.add("a");  // ------->  to check whether they accept the duplicate or not
		a.add("b");
		a.add("b");
		a.add("c");
		a.add("c");
		a.add("d");
		a.add("e");
		
		
		System.out.println(a);
	}
	
	
	
	// insert the both interger and the string values 
	
	
	static void op() {
		LinkedHashSet<Object> b=new LinkedHashSet<Object>();
		b.add("a");
		b.add("a");    // ------->  to check whether they accept the duplicate or not
		b.add("b");
		b.add("b");
		b.add("c");
		b.add("c");
		
		b.add(1);
		b.add(1);
		b.add(2);
		b.add(2);
		b.add(3);
		b.add(3);
		
		System.out.println(b);
		
	}
}


public class linkedhashset {
  public static  void main(String [] args) {
	  r.dispaly();
	 
	  r.output();
	  
	  r.op();
  }
}

package com.global;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;




//public class Collection_02 {
//
//	public static void main(String[] args) {
//
//		Map<Integer, String> data = new Hashtable<Integer, String>();
//		
//		data.put(1, "Ritesh");
//		data.put(2, "Mayur");
//		data.put(3, null);
////		data.put(null, "Riya"); you can not have null as key...
////		data.put(null, "Sejal");
//		
//		Set<Integer> keys = data.keySet();
//		
//		Iterator<Integer> it = keys.iterator();
//		
//		while ( it.hasNext() ) {
//			
//			Integer key = it.next();
//			
//			System.out.println(data.get(key));
//		}
//	}
//}


//public class Collection_02 {
//
//	public static void main(String[] args) {
//
//		Map<Integer, String> data = new HashMap<Integer, String>();
//		
//		data.put(1, "Ritesh");
//		data.put(2, "Mayur");
//		data.put(3, "Lakiti");
//		data.put(null, "Riya");
//		data.put(null, "Sejal");
//		
//		Set<Integer> keys = data.keySet();
//		
//		Iterator<Integer> it = keys.iterator();
//		
//		while ( it.hasNext() ) {
//			
//			Integer key = it.next();
//			
//			System.out.println(data.get(key));
//		}
//	}
//}

//public class Collection_02 {
//
//	public static void main(String[] args) {
//
//		Map<Integer, String> data = new HashMap<Integer, String>();
//		
//		data.put(1, "Ritesh");
//		data.put(2, "Mayur");
//		data.put(3, "Lakiti");
//		data.put(4, "Mayur");
//		data.put(8, "Anurag");
//		data.put(5, "Mayur");
//		data.put(6, null);
//		data.put(7, null);
//		data.put(4, "Anurag");
//		
//		Set<Integer> keys = data.keySet();
//		
//		Iterator<Integer> it = keys.iterator();
//		
//		while ( it.hasNext() ) {
//			
//			Integer key = it.next();
//			
//			System.out.println(data.get(key));
//		}
//	}
//}


//public class Collection_02 {
//
//	public static void main(String[] args) {
//
//		Set<String> set = new HashSet<String>();
//		
//		set.add("Jay");
//		set.add("Tushar");
//		set.add("Ashu");
//		set.add("Prakarsh");
//		
//		Iterator it =  set.iterator();
//		
//		while( it.hasNext() ) {
//			
//			System.out.println(it.next());
//		}
//	}
//}

//public class Collection_02 {
//
//	public static void main(String[] args) {
//
//		List<Integer> list = new ArrayList<Integer>();
//
//		list.add(45);
//		list.add(23);
//		list.add(41);
//		list.add(12);
//
//		for (int value : list) {
//
//			System.out.println(value);
//		}
//		
//		System.out.println("*********************");
//
//		Collections.sort(list);
//
//		for (int value : list) {
//
//			System.out.println(value);
//		}
//	}
//}

//public class Collection_02 {
//
//	public static void main(String[] args) {
//
//		Set<Human> set = new TreeSet<Human>(new HumanHeightComparator());
//		
//		
//		
//		Human h1 = new Human();
//		Human h2 = new Human();
//		
//		h1.height = 2;
//		
//		set.add(h1);    set.add(h2);
//		
//		
//		for( Human human : set) {
//			
//			System.out.println(human);
//		}
//	}
//}

//public class Collection_02 {
//
//	public static void main(String[] args) {
//
//		Set<Human> set = new TreeSet<Human>();
//		
//		Human h1 = new Human();
//		Human h2 = new Human();
//		
//		h2.iq = 60;       h1.mascularStrength = 70;
//		
//		set.add(h1);    set.add(h2);
//		
//		
//		for( Human human : set) {
//			
//			System.out.println(human);
//		}
//	}
//}

//public class Collection_02 {
//
//	public static void main(String[] args) {
//
//		Set<String> set = new TreeSet<String>();
//		
//		set.add("Jay");
//		set.add("Tushar");
//		set.add("Ashu");
//		set.add("Prakarsh");
//		set.add("Ashu");
//		
//		for( String name : set) {
//			
//			System.out.println(name);
//		}
//	}
//}

//public class Collection_02 {
//
//	public static void main(String[] args) {
//
//		Set<String> set = new LinkedHashSet<String>();
//		
//		set.add("Jay");
//		set.add("Tushar");
//		set.add("Ashu");
//		set.add("Prakarsh");
//		set.add("Ashu");
//		
//		for( String name : set) {
//			
//			System.out.println(name);
//		}
//	}
//}

//public class Collection_02 {
//
//	public static void main(String[] args) {
//
//		HashSet<Human> set = new HashSet<Human>();
//		
//		Human h1 = new Human();
//		Human h2 = new Human();
//		
//		h2.iq = 60;
//		
//		set.add(h1);    set.add(h2);
//		
//		System.out.println(h1.hashCode());
//		System.out.println(h2.hashCode());
//		
//		
//		for( Human human : set) {
//			
//			System.out.println(human);
//		}
//	}
//}

//public class Collection_02 {
//
//	public static void main(String[] args) {
//
//		HashSet<String> set = new HashSet<String>();
//		
//		set.add("Jay");
//		set.add("Tushar");
//		set.add("Ashu");
//		set.add("Prakarsh");
//		
//		for( String name : set) {
//			
//			System.out.println(name);
//		}
//	}
//}

//public class Collection_02 {
//
//	public static void main(String[] args) {
//
//		ArrayList<Human> list = new ArrayList<Human>();
//		
//		Human h1 = new Human();
//		Human h2 = new Human(23, 56, 76);
//		
//		list.add(h1);    list.add(h2);
//
//		for(Human human : list) {
//			
//			list.remove(human);
//		}
//	}
//}

//public class Collection_02 {
//
//	public static void main(String[] args) {
//
//		ArrayList<Human> list = new ArrayList<Human>();
//		
//		Human h1 = new Human();
//		Human h2 = new Human(23, 56, 76);
//		
//		list.add(h1);    list.add(h2);
//
//		for(Human human : list) {
//			
//			System.out.println(human.iq+", "+human.mascularStrength);
//		}
//	}
//}

//public class Collection_02 {
//
//	public static void main(String[] args) {
//
//		ArrayList<Integer> list = new ArrayList<Integer>();
//
//		list.add(4);
//		list.add(199);
//		//list.add("Sumit");This statement is not legal since I have made collection generic to Integer
//
//		System.out.println(list);
//
//	}
//
//}

//public class Collection_02 {
//
//	public static void main(String[] args) {
//
//		ArrayList list = new ArrayList();
//
//		list.add(4);
//		list.add(199);
//		list.add("Sumit");
//
//		for (int i = 0; i < list.size(); i++) {
//
//			System.out.println(list.get(i));
//		}
//
//		//list.remove(2);
//		boolean status = list.remove("Manit");
//		
//		System.out.println(status);
//
//		for (int i = 0; i < list.size(); i++) {
//
//			System.out.println(list.get(i));
//		}
//
//	}
//
//}

//public class Collection_02 {
//
//	public static void main(String[] args) {
//
//		ArrayList list = new ArrayList();
//
//		list.add(4);
//		list.add(199);
//		list.add("Sumit");
//
//		for (int i = 0; i < list.size(); i++) {
//
//			System.out.println(list.get(i));
//		}
//
//		list.set(1, "Siddhi");
//
//		for (int i = 0; i < list.size(); i++) {
//
//			System.out.println(list.get(i));
//		}
//
//	}
//
//}

//import java.util.ArrayList;
//
//public class Collection_02 {
//
//	public static void main(String[] args) {
//
//		ArrayList list = new ArrayList();
//
//		list.add(4);
//		list.add(199);
//		list.add("Sumit");
//
//		for (int i = 0; i < list.size(); i++) {
//
//			System.out.println(list.get(i));
//		}
//
//		list.add(1, "Siddhi");
//
//		for (int i = 0; i < list.size(); i++) {
//
//			System.out.println(list.get(i));
//		}
//
//		// System.out.println(list.size());
//	}
//
//}

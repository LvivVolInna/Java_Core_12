package hw12_3;

public class AppHw12_3 {
	
	public static void main(String[] args) {

		MyOwnArrayList list = new MyOwnArrayList();
		MyOwnArrayList list2 = new MyOwnArrayList(10);

		System.out.println(list.toString());
		list.add("product 1");
		list.add("product 2");
		list.add("product 3");
		list.add("product 4");
		list.add("product 5");
		list.add("product 6");
		list.add("product 7");
		System.out.println("1: " + list.toString());
		list.add("product 8");
		System.out.println("2: " + list.toString());

		System.out.println("3: " + list2.toString());
		System.out.println(list2.equals(list));

		list2.remove(0);
		list2.remove(0);
		list2.remove(0);
		System.out.println("4: " + list2.toString());
		
		list2.add("product 1");
		list2.add("product 2");
		list2.add("product 3");
		list2.add("product 4");
		list2.add("product 5");
		list2.add("product 6");
		list2.add("product 1");
		list2.add("product 2");
		list2.add("product 3");
		list2.add("product 4");
		list2.add("product 5");
		list2.add("product 6");
		System.out.println("5: " + list2.toString());
		
		list2 = list;
		System.out.println("6: " + list2.toString());

		System.out.println("7: " + list2.remove(3));
		System.out.println("8: " + list2.remove(3));
		System.out.println("9: " + list2.remove(3));
		System.out.println("10: " + list2.toString());

	}

}



package hw12_3;

import java.util.Arrays;

public class MyOwnArrayList {

	private String[] someProduct;
	private int MyOwnArrayListSize;

	public MyOwnArrayList(String[] someProduct) {
		this.someProduct = someProduct;
	}

	public MyOwnArrayList() {
		int MyOwnArrayListSize = 7;
		this.someProduct = new String[this.MyOwnArrayListSize];
	}

	public MyOwnArrayList(int MyOwnArrayListSize) {
		this.MyOwnArrayListSize = MyOwnArrayListSize;
		this.someProduct = new String[this.MyOwnArrayListSize];
	}

	public void add(String value) {
		int productSize = 0;

		for (int i = 0; i < someProduct.length; i++) {
			if (someProduct[i] != null) {
				productSize++;
			}
		}

		if ((productSize + 1) > someProduct.length) {
			String[] newSomeProduct = new String[(someProduct.length*2) + 1];

			for (int i = 0; i < someProduct.length; i++) {
				newSomeProduct[i] = someProduct[i];
			}

			someProduct = newSomeProduct;
			MyOwnArrayListSize = newSomeProduct.length;
		}

		someProduct[productSize++] = value;
	}

	public String remove(int index) {
		String removedProduct = someProduct[index];

		String[] newSomeProduct = new String[someProduct.length - 1];

		for (int i = 0; i < index; i++) {
			newSomeProduct[i] = someProduct[i];
		}

		for (int i = index; i < someProduct.length - 1; i++) {
			newSomeProduct[i] = someProduct[i + 1];
		}

		someProduct = newSomeProduct;
		MyOwnArrayListSize = newSomeProduct.length;

		return removedProduct;
	}

	@Override
	public String toString() {
		return "MyOwnArrayList [someProduct=" + Arrays.toString(someProduct) + ", size=" + MyOwnArrayListSize + "]";
	}

}

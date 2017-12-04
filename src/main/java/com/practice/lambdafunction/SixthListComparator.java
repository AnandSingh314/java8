package com.practice.lambdafunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SixthListComparator {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "RAM", 2000));
		list.add(new Product(5, "Processor", 10000));
		list.add(new Product(3, "Keyboard", 1500));
		list.add(new Product(2, "Mouse", 500));
		list.add(new Product(4, "Headphone", 2000));
		
		Comparator<Product> nameComparator = (p1,p2)->(p1.name.compareTo(p2.name));
		Comparator<Product> idComparator = (p1,p2)->(p1.id >= p2.id? 1 : -1);
		Comparator<Product> priceComparator = (p1,p2)->(p1.price >= p2.price? 1 : -1);

		System.out.println("Sorting with name");
		Collections.sort(list, nameComparator);
		for(Product p : list)
			System.out.println(p);

		System.out.println("\nSorting with id");
		Collections.sort(list, idComparator);
		for(Product p : list)
			System.out.println(p);

		System.out.println("\nSorting with price");
		Collections.sort(list, priceComparator);
		for(Product p : list)
			System.out.println(p);

		
	}
}

class Product {
	int id;
	String name;
	int price;
	
	/**
	 * @param id
	 * @param name
	 * @param price
	 */
	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "[ id=" +this.id+", "
				+ "name="+this.name+ ", "
						+ "price="+this.price+" ]";
	}
	
}

package util;

import java.util.function.Predicate;

import entities.Product;
//Predicate é uma interface funciona do Java

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product t) {
		return t.getPrice()>=100.00;
	}

}

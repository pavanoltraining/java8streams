package filterdemos;

import java.util.ArrayList;
import java.util.List;

class Product
{
	int id;
	String name;
	double price;
	
	public Product(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

public class FilterDemo4 {

	public static void main(String[] args) {
		

		List <Product>productsList=new ArrayList<Product>();
		
		productsList.add(new Product(1,"HP Laptop",25000));
		productsList.add(new Product(2,"Dell Laptop",30000));
		productsList.add(new Product(3,"Lenova Laptop",28000));
		productsList.add(new Product(4,"Sony Laptop",23000));
		productsList.add(new Product(4,"Apple Laptop",90000));
		
		
		productsList.stream()
							.filter(p->p.price>25000)  // filtering
							.forEach(pr->System.out.println(pr.price));  //iterating
		
		
		
	}

}

package com.example.demo;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Runwebapi {
	Product_info object=new Product_info();
	@GetMapping("/home")
public String home()
{
	return "this is home paage";
}
	//get all product
	@GetMapping("/listofproduct")
	public List<Product_Attributes> getDummyProductList()
	{
		 List<Product_Attributes> listofprod=object.getAllprodList();
	        return listofprod;
	}
	
	//add product
	Product_info object1=new Product_info();
	 @PostMapping(value="/insertproduct")
	 public Product_Attributes insertproduct(@RequestBody Product_Attributes prod)
	{
		return object1.addproduct(prod);
	}
	//update product
	 @PutMapping(value="/update")
	 public Product_Attributes updateproducts(@RequestBody Product_Attributes prod)
	 {
		 return object1.addproduct(prod);
	 }
	 
	 //get product by id
	 @GetMapping("/product/{Id}")
	 public Product_Attributes getproductbyId(@PathVariable("Id") Integer Id)
	 {
		 Product_Attributes obj=new Product_Attributes();
		 obj.getId();
		 obj.getName();
		 obj.getBrand_name();
		 obj.getProd_type();
		 obj.getPrice();
		 return obj;
	 }
	 
	
}

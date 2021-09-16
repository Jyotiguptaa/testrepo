package com.example.demo;

public class Product_Attributes {
	
	private int Id;
	private String name;
	private String Brand_name;
	private String Prod_type;
	private int Price;

	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand_name() {
		return Brand_name;
	}
	public void setBrand_name(String brand_name) {
		Brand_name = brand_name;
	}
	public String getProd_type() {
		return Prod_type;
	}
	public void setProd_type(String prod_type) {
		Prod_type = prod_type;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	public Product_Attributes(){
		
        super();
    }
   
	
	
	
	//parameterized constructor
	public Product_Attributes(int Id,String name,String Brand_name,String Prod_type,Integer Price){
	    
        super();
        this.Id=Id;
        this.name=name;
        this.Brand_name=Brand_name;
        this.Prod_type=Prod_type;
        this.Price=Price;
    }
	
	
	
	
	
	
	
}

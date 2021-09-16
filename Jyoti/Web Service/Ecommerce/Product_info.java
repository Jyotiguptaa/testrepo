package com.example.demo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Product_info {
	static HashMap<Integer, Product_Attributes> orderproductIdMap = getproductIdMap(); //map list
	public Product_info()
	{
		super();
		if(orderproductIdMap==null)
		{
			orderproductIdMap=new HashMap<Integer, Product_Attributes>();
					Product_Attributes obj1= new Product_Attributes(1, "Lux", "Lux", "Commercial",10);
			        Product_Attributes obj2= new Product_Attributes(2, "fan", "usha", "Household",760);
			        Product_Attributes obj3 =new Product_Attributes(3, "Bag", "Fastrack", "Commercial",975);
			        Product_Attributes obj4 =new Product_Attributes(4, "Mobile", "Redmi", "Telecommunication",19760);
			        
			        
			        orderproductIdMap.put(1,obj1);
			        orderproductIdMap.put(2,obj2);
			        orderproductIdMap.put(3,obj3);
			        orderproductIdMap.put(4,obj4);
			        
		}
	}
	
	public List<Product_Attributes> getAllprodList() {
	        List<Product_Attributes> productattributes = new ArrayList<Product_Attributes>( orderproductIdMap.values());
	        return productattributes;
	        }

	 //get

	         public Product_Attributes getproductIdMap(int id) {
	        	 Product_Attributes prod = orderproductIdMap.get(id);
	        return prod;
	        }
	         
	         
	         // insert/add product
	         public Product_Attributes addproduct(Product_Attributes prod) {
	         prod.setId(getMaxId()+ 1);
	         
	         // key , value
	         orderproductIdMap.put(prod.getId(), prod); ///logic class
	         return prod;
	         }
	       //update
	         public Product_Attributes updateStudentinfo(Product_Attributes prod) {
	         if (prod.getId() <= 0)
	         return null;
	       orderproductIdMap.put(prod.getId(), prod);
	         return prod;
	         }
	         
	         //delete

	  

	          public void deleteprofuct(int id) {
	         orderproductIdMap.remove(id);
	         }

	  

	          public static HashMap<Integer, Product_Attributes> getproductIdMap() {
	         return orderproductIdMap;
	         }

	         
	          // Utility method to get max id
	          public static int getMaxId(){
	          int max = 0;
	          for (int id : orderproductIdMap.keySet()) {
	          if (max <= id)
	          max = id;

	   

	           }
	          return max;
	          }
	         
	         
}

		
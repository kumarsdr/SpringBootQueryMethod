package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
	
	
	 // @Query(" select p from com.app.model.Product p") 
	 // public List<Product> getMyData();
	  
	
	 // @Query(" select p.prodCost from com.app.model.Product p ") 
	 // public List<Product> getCostOnly();
	  
	 // @Query(" select p.prodCost,p.prodCode com.app.model.Product p ") 
	 // public List<Product[]> getInfo(Double prodCost, String prodCode);
	  
	  //public List<Product> getInfo();
	  
	  //passing parameter(Input at Runtime)----------------------------------
	  
	  //Positional Parameter(?1,?2,?3........................................)
	  
	 // @Query(" select p from com.app.model.Product p where p.prodId=?1 or p.prodCost<?2 ") 
	  //public List<Product> getNewData(Integer id,Double cost);
	 
	
	 
	  
	
	 // @Query(" select p from com.app.model.Product p where p.prodId=?1 or p.prodCost<?2 ")
	  
	  //@Query(" select p from com.app.model.Product p where p.prodId=?1 ")
	  
	  @Query(" select p from com.app.model.Product p") 
	  public List<Product> getMyDataName(Double prodCost, String prodCode);

	
	  
	  //@Query(" select p from com.app.model.Product p where p.prodId in: a order by p.prodId desc ") 
	 // public List<Product> getMyData();
	 
	


	 

	
}

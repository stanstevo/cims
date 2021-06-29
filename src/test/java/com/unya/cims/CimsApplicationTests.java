package com.unya.cims;

import com.unya.cims.entity.Product;
import com.unya.cims.service.IProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CimsApplicationTests {

	@Autowired
	private IProductService productService;
	private Product sugarProduct;

	@Test
	void contextLoads() {
	}

	@Test
	void fetchProductById_returnSugarForID3() {
		//givenProductsAreInStock();
		whenSearchForProductWithID3();
		thenReturnOneProductOfSugarForID3();
	}

/*	private void givenProductsAreInStock() {
	}*/

	private void whenSearchForProductWithID3() {
		sugarProduct = productService.fetchByID(6);
	}

	private void thenReturnOneProductOfSugarForID3() {
		String description = sugarProduct.getDescription();
		assertEquals("Sugar", description);
	}


}

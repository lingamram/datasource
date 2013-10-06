package com.mkyong.stock.bo.impl;

import com.mkyong.base.BaseTest;
import com.mkyong.integration.IntegrationTest;
import com.mkyong.stock.dao.StockDao;
import com.mkyong.stock.model.Stock;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;
@Category(IntegrationTest.class)
public class StockBoImplIntegrationTest  extends BaseTest{
    @Autowired
    StockBoImpl stockBo;

    @Test
    public void testSave(){
        Stock stock = new Stock();
        stock.setStockCode("9999");
        stock.setStockName("STOCKN");
        stockBo.save(stock);
        stockBo.findByStockCode("9999");
        assertEquals("9999", stock.getStockCode());
        assertEquals("STOCKN", stock.getStockName());
}

/*
	@InjectMocks
	StockBoImpl stockBo;
//	StockDao stockDao;
	
//	@Mock
	StockDao stockDao;
	
	@Before
	public void setUP(){
		stockBo = new StockBoImpl();
		stockDao = Mockito.mock(StockDao.class);
		stockBo.stockDao = stockDao;
    	

	}
	
	@Test
	public void testSave(){
		Stock stock = new Stock();
    	stock.setStockCode("7668");
    	stock.setStockName("HAIO");
    	Mockito.when(stockDao.findByStockCode("7668")).thenReturn(stock);
    	stockBo.findByStockCode("7668");
    	
    	//Verify the number of interactions with mock
        Mockito.verify (stockDao, Mockito.times(1)).findByStockCode("7668");
           
    	assertEquals("7668", stock.getStockCode());
    	
    
    	
	}
*/

}

package com.mkyong.stock.bo.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

import com.mkyong.stock.bo.StockBo;
import com.mkyong.stock.dao.StockDao;
import com.mkyong.stock.model.Stock;

public class StockBoImplTest {
	
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
	
}

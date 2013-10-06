package com.mkyong.stock.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mkyong.base.BaseTest;
import com.mkyong.stock.dao.StockDao;
import com.mkyong.stock.model.Stock;

public class StockDaoImplTest extends BaseTest {
	
	@Autowired
	StockDao stockDao;
	
	/*@Test
	public void testFindByStockCode() {
		Stock stock = stockDao.findByStockCode("7668");
		assertEquals(stock.getStockCode(),"7668" );
	}*/
	
	@Test
	public void saveStock() {
		Stock stock = new Stock();
    	stock.setStockCode("1000");
    	stock.setStockName("RBS");
    	stockDao.save(stock);
		Stock stockNew = stockDao.findByStockCode("1000");
		assertEquals(stockNew.getStockCode(),"1000" );

		assertEquals("1000",stockNew.getStockCode());
	}
	
}
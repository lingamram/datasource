package com.mkyong.stock.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkyong.stock.bo.StockBo;
import com.mkyong.stock.dao.StockDao;
import com.mkyong.stock.model.Stock;
import org.springframework.transaction.annotation.Transactional;

@Service("stockBo")
public class StockBoImpl implements StockBo{
	
	@Autowired
	StockDao stockDao;

    //Test comments
	public void setStockDao(StockDao stockDao) {
		this.stockDao = stockDao;
	}

    //Save method goes here.
	public void save(Stock stock){
		stockDao.save(stock);
	}
	
	public void update(Stock stock){
		stockDao.update(stock);
	}
	
	public void delete(Stock stock){
		stockDao.delete(stock);
	}
    @Transactional(readOnly = true)
	public Stock findByStockCode(String stockCode){
		return stockDao.findByStockCode(stockCode);
	}
}

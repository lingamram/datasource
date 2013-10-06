package com.mkyong.stock.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mkyong.stock.dao.AbstractDao;
import com.mkyong.stock.dao.StockDao;
import com.mkyong.stock.model.Stock;
@Transactional
@Repository("stockDao")
public class StockDaoImpl extends AbstractDao implements StockDao {

	public void save(Stock stock){
		getSession().save(stock);
	}
	
	public void update(Stock stock){
		getSession().update(stock);
	}
	
	public void delete(Stock stock){
		getSession().delete(stock);
	}
	
	public Stock findByStockCode(String stockCode){
		Query query = getSession().createQuery("from Stock where stockCode = :code ");
		query.setParameter("code", stockCode);
		List list = query.list();
		return (Stock)list.get(0);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package com.enjoy.dao;

import com.enjoy.entity.Order;

public interface OrderService {

	/**
	 * 寻找源仓库
	 * 
	 * @param type
	 *            商品类型,a=1,b=2,c=3
	 * @param count
	 *            出货数量
	 */
	void getGoods(Order order);

}

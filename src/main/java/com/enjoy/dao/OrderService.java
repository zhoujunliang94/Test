package com.enjoy.dao;

import com.enjoy.entity.Order;

public interface OrderService {

	/**
	 * Ѱ��Դ�ֿ�
	 * 
	 * @param type
	 *            ��Ʒ����,a=1,b=2,c=3
	 * @param count
	 *            ��������
	 */
	void getGoods(Order order);

}

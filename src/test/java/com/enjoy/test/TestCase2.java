package com.enjoy.test;

import org.junit.Test;

import com.enjoy.dao.OrderServiceImp;
import com.enjoy.entity.Order;
import com.enjoy.utils.PrintUtil;

public class TestCase2 {

	/**
	 * �µ���ƷB 2��
	 */
	@Test
	public void test2() {

		System.out.println("�µ� B ��Ʒ 4 ��");
		PrintUtil.PrintHead();
		new OrderServiceImp().getGoods(new Order(2, 4));
		System.out.println("\n\n");
	}

}

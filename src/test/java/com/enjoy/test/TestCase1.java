package com.enjoy.test;

import org.junit.Test;

import com.enjoy.dao.OrderServiceImp;
import com.enjoy.entity.Order;
import com.enjoy.utils.PrintUtil;

public class TestCase1 {

	/**
	 * �µ���ƷA 2��
	 */
	@Test
	public void test1() {

		System.out.println("�µ� A ��Ʒ 2 ��");
		PrintUtil.PrintHead();
		new OrderServiceImp().getGoods(new Order(1, 2));
		System.out.println("\n\n");
	}

}

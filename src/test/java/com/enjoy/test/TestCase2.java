package com.enjoy.test;

import org.junit.Test;

import com.enjoy.dao.OrderServiceImp;
import com.enjoy.entity.Order;
import com.enjoy.utils.PrintUtil;

public class TestCase2 {

	/**
	 * 下单商品B 2个
	 */
	@Test
	public void test2() {

		System.out.println("下单 B 商品 4 件");
		PrintUtil.PrintHead();
		new OrderServiceImp().getGoods(new Order(2, 4));
		System.out.println("\n\n");
	}

}

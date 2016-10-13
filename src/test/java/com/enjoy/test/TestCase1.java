package com.enjoy.test;

import org.junit.Test;

import com.enjoy.dao.OrderServiceImp;
import com.enjoy.entity.Order;
import com.enjoy.utils.PrintUtil;

public class TestCase1 {

	/**
	 * 下单商品A 2个
	 */
	@Test
	public void test1() {

		System.out.println("下单 A 商品 2 件");
		PrintUtil.PrintHead();
		new OrderServiceImp().getGoods(new Order(1, 2));
		System.out.println("\n\n");
	}

}

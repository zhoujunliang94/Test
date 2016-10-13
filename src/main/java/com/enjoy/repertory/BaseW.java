/**
 * 
 */
package com.enjoy.repertory;

import com.enjoy.entity.Order;
import com.enjoy.utils.PrintUtil;

/**
 * 仓库基类
 * 
 * @author Noodle
 * 
 */
public class BaseW {

	private int a;
	private int b;
	private int c;

	private int distance;
	private int priority;

	private String name;

	/**
	 * 构造器
	 * 
	 * @param a
	 *            A商品数量
	 * @param b
	 *            B商品数量
	 * @param c
	 *            C商品数量
	 * @param distance
	 *            距离
	 * @param priority
	 *            优先级
	 * @param name
	 *            仓库名称
	 */
	public BaseW(int a, int b, int c, int distance, int priority, String name) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.name = name;
		this.distance = distance;
		this.priority = priority;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setC(int c) {
		this.c = c;
	}

	public boolean getA() {

		if (a > 0) {
			a--;
			PrintUtil.PrintRow(1, 1, getName());
			return true;
		}

		return false;
	}

	public boolean getB() {

		if (b > 0) {
			b--;
			PrintUtil.PrintRow(2, 1, getName());
			return true;
		}

		return false;
	}

	public boolean getC() {

		if (c > 0) {
			c--;
			PrintUtil.PrintRow(3, 1, getName());
			return true;
		}

		return false;
	}

	/**
	 * 根据商品类型返回商品数量
	 * 
	 * @param type
	 * @return
	 */
	public int getCountByType(int type) {
		switch (type) {
		case 1:
			return a;

		case 2:
			return b;

		case 3:
			return c;

		default:
			return 0;
		}
	}

	/**
	 * 根据类型出货
	 * 
	 * @param type
	 */
	private void getGoodsByType(int type) {
		switch (type) {
		case 1:
			getA();
			break;
		case 2:
			getB();
			break;
		case 3:
			getC();
			break;

		default:
			break;
		}
	}

	/**
	 * 当前仓库是否能独自满足出货需求
	 * 
	 * @param order
	 * @return
	 */
	public boolean canSatisfy(Order order) {

		if (getCountByType(order.getType()) >= order.getCount()) {
			return true;
		}

		return false;
	}

	/**
	 * 开始出货
	 * 
	 * @param order
	 */
	public void beginDeliver(Order order) {

		int total = 0;
		if (getCountByType(order.getType()) >= order.getCount()) {
			total = order.getCount();
		} else {
			total = getCountByType(order.getType());
		}
		for (int i = 0; i < total; i++) {
			getGoodsByType(order.getType());
			order.setCount(order.getCount() - 1);
		}

	}

}

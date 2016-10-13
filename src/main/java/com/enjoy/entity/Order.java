/**
 * 
 */
package com.enjoy.entity;

/**
 * 订单需求，封装了商品数量和种类
 * 
 * @author Noodle
 * 
 */
public class Order {

	/**
	 * 商品种类,a=1,b=2,c=3;
	 */
	private int type;

	/**
	 * 购买数量
	 */
	private int count;

	/**
	 * 初始化订单任务
	 * 
	 * @param type
	 *            商品种类
	 * @param count
	 *            购买数量
	 */
	public Order(int type, int count) {
		super();
		this.type = type;
		this.count = count;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}

/**
 * 
 */
package com.enjoy.entity;

/**
 * �������󣬷�װ����Ʒ����������
 * 
 * @author Noodle
 * 
 */
public class Order {

	/**
	 * ��Ʒ����,a=1,b=2,c=3;
	 */
	private int type;

	/**
	 * ��������
	 */
	private int count;

	/**
	 * ��ʼ����������
	 * 
	 * @param type
	 *            ��Ʒ����
	 * @param count
	 *            ��������
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

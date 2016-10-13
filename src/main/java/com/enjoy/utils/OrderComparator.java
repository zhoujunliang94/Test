/**
 * 
 */
package com.enjoy.utils;

import java.util.Comparator;

import com.enjoy.entity.Order;
import com.enjoy.repertory.BaseW;

/**
 * �ֿ��ۺϱȽ����������������ģ�ͬ��������Ҿ�������ģ�ͬ��������������ȼ��ߵ�
 * 
 * @author Noodle
 * 
 */
public class OrderComparator implements Comparator<BaseW> {

	private Order order;

	/**
	 * �ֿ��ۺϱȽ����������������ģ�ͬ��������Ҿ�������ģ�ͬ��������������ȼ��ߵ�
	 * 
	 * @param order
	 */
	public OrderComparator(Order order) {
		this.order = order;
	}

	public int compare(BaseW o1, BaseW o2) {
		// ���Ȱ�����Ʒ����������
		if (o2.getCountByType(order.getType())
				- o1.getCountByType(order.getType()) == 0) {
			// ��Ʒ������ͬ,���ղֿ��������,�ֿ������ͬ,���ղֿ����ȼ�����
			return o1.getDistance() - o2.getDistance() == 0 ? o2.getPriority()
					- o1.getPriority() : o1.getDistance() - o2.getDistance();
		} else {
			return o2.getCountByType(order.getType())
					- o1.getCountByType(order.getType());
		}
	}

}

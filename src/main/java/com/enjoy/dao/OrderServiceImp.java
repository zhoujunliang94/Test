/**
 * 
 */
package com.enjoy.dao;

import java.util.ArrayList;
import java.util.List;

import com.enjoy.entity.Order;
import com.enjoy.repertory.BaseW;
import com.enjoy.utils.OrderComparator;
import com.enjoy.utils.OrderDistanceOrPriorityComparator;

/**
 * @author Noodle
 * 
 */
public class OrderServiceImp implements OrderService {

	/*
	 * ѰԴ����
	 */
	public void getGoods(Order order) {

		// if (findSourceByOneW(order)) {
		// // ����һ���ֿ�Ϳ����������Ҫ��
		// } else {
		// ��Ҫ����ֿ�����������Ҫ��
		findSourceByManyW(order);
		// }

	}

	/**
	 * �ڶ���ֿ���ѰԴ
	 * 
	 * @param order
	 */
	private void findSourceByManyW(Order order) {
		// 2.����жϵ����ֿⲻ�ܶ����������Ҫ������
		List<BaseW> ws = initW();

		// �Ȱ�����Ʒ�������򡢲ֿ�������򡢲ֿ����ȼ���������
		ws.sort(new OrderComparator(order));

		int total_count = 0;
		int size1 = ws.size();
		// 2.1ɸѡ�ֿ⼯���п����������Ҫ�����С�Ӽ�
		for (int i = 0, true_index = 0; i < size1; i++, true_index++) {

			if (total_count >= order.getCount()) {
				ws.remove(true_index);
				true_index--;
			} else {
				total_count += ws.get(true_index).getCountByType(
						order.getType());
			}
		}
		// 2.2�������ϣ���ʼ����
		for (BaseW baseW : ws) {
			baseW.beginDeliver(order);
		}
	}

	/**
	 * �ڵ����ֿ���ѰԴ
	 * 
	 * @param order
	 *//*
	private boolean findSourceByOneW(Order order) {
		List<BaseW> ws = initW();

		// 1.�����жϵ����ֿ��Ƿ��ܶ��������������ɸѡ�ֿ��б������Ƿ���ڵ����ֿ���������������
		int size = ws.size();
		for (int i = 0, true_index = 0; i < size; i++, true_index++) {
			if (!ws.get(true_index).canSatisfy(order)) {
				ws.remove(true_index);
				true_index--;
			}
		}

		if (!ws.isEmpty()) {
			if (ws.size() >= 2) {
				ws.sort(new OrderDistanceOrPriorityComparator());
			}
			// 1.1ѡ���òֿ⣬��ʼ����
			BaseW target = ws.get(0);
			target.beginDeliver(order);
			return true;
		}
		return false;
	}*/

	/**
	 * ��ʼ���ֿ⣬������ĿҪ������������
	 * 
	 * @return
	 */
	private List<BaseW> initW() {
		List<BaseW> ws = new ArrayList<BaseW>();

		ws.add(new BaseW(1, 2, 2, 1, 1, "W1"));
		ws.add(new BaseW(2, 1, 2, 2, 2, "W2"));
		ws.add(new BaseW(1, 3, 1, 2, 3, "W3"));
		return ws;
	}

}

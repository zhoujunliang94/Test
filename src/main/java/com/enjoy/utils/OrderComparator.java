/**
 * 
 */
package com.enjoy.utils;

import java.util.Comparator;

import com.enjoy.entity.Order;
import com.enjoy.repertory.BaseW;

/**
 * 仓库综合比较器，先找数量最多的，同等情况下找距离最近的，同等情况下再找优先级高的
 * 
 * @author Noodle
 * 
 */
public class OrderComparator implements Comparator<BaseW> {

	private Order order;

	/**
	 * 仓库综合比较器，先找数量最多的，同等情况下找距离最近的，同等情况下再找优先级高的
	 * 
	 * @param order
	 */
	public OrderComparator(Order order) {
		this.order = order;
	}

	public int compare(BaseW o1, BaseW o2) {
		// 首先按照商品数量来排序
		if (o2.getCountByType(order.getType())
				- o1.getCountByType(order.getType()) == 0) {
			// 商品数量相同,按照仓库距离排序,仓库距离相同,按照仓库优先级排序
			return o1.getDistance() - o2.getDistance() == 0 ? o2.getPriority()
					- o1.getPriority() : o1.getDistance() - o2.getDistance();
		} else {
			return o2.getCountByType(order.getType())
					- o1.getCountByType(order.getType());
		}
	}

}

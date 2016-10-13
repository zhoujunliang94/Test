/**
 * 
 */
package com.enjoy.utils;

import java.util.Comparator;

import com.enjoy.repertory.BaseW;

/**
 * 仓库距离或者优先级比较器，在满足商品数量的情况下，优先筛选距离近的仓库，再到优先级高的仓库
 * 
 * @author Noodle
 * 
 */
public class OrderDistanceOrPriorityComparator implements Comparator<BaseW> {

	public int compare(BaseW o1, BaseW o2) {
		return o1.getDistance() - o2.getDistance() == 0 ? o2.getPriority()
				- o1.getPriority() : o1.getDistance() - o2.getDistance();
	}

}

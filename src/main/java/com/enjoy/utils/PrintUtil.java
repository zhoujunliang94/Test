/**
 * 
 */
package com.enjoy.utils;

/**
 * 打印工具类
 * 
 * @author Noodle
 * 
 */
public class PrintUtil {

	private static int num = 1;

	private static void resetNum() {
		num = 1;
	}

	public static void PrintRow(int type, int count, String w) {

		System.out.println(num++ + "							"
				+ (type == 1 ? "a" : (type == 2 ? "b" : "c")) + "							"
				+ count + "							" + w);

	}

	public static void PrintHead() {
		resetNum();
		System.out.println("发货单号	商品名称	数量		出货仓库");
	}
}

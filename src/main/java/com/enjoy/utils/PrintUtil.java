/**
 * 
 */
package com.enjoy.utils;

/**
 * ��ӡ������
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
		System.out.println("��������	��Ʒ����	����		�����ֿ�");
	}
}

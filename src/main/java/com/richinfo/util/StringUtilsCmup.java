package com.richinfo.util;

/**
 *
 * �����ַ��������࣬��cmup��Ϊ����commons-lang��StringUtils����
 * @author JinChao
 * 
 * @date 2015��11��20�� ����11:02:07
 * 
 *
 */
public class StringUtilsCmup {
	
	/**
	 * ��nullֵ����Ϊ����
	 * @param s
	 * @return
	 */
	public static String trimNull2Blank(String s) {
		return (s == null) ? "" :s;
	}
}

package com.richinfo.util;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

/**
 * properties文件工具类
 * 注意：使用此类，属性文件必须由Spring管理才可以直接获取到属性值
 * @author JinChao
 *
 */
public class PropertiesUtil {
	@Value("${ip}")
	public String  ip="";
	/**
	 * 取得属性值
	 * @param perpertyName 属性名
	 * @return
	 */
	public  String getPropertyValue(String perpertyName){
		if (ip.equals("") || ip == null) {
			return "属性文件未初始化成功！";
		}else if(perpertyName=="ip"){
			return ip;
		}else if(perpertyName=="ip"){
			return ip;
		}
		return "perpertyName为空";
	}
}

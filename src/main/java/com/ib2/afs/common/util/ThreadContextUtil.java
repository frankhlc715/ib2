package com.ib2.afs.common.util;

import java.util.HashMap;
import java.util.Map;

public class ThreadContextUtil {
	
	private final static ThreadLocal<Map<String,Object>> threadLocal = new ThreadLocal<Map<String,Object>>();

	public static void set(String key,Object obj){
		Map<String,Object> map = threadLocal.get();
		if(null==map){
			map = new HashMap<String,Object>();
			threadLocal.set(map);
		}
		map.put(key, obj);
	}
	
	public static Object get(String key){
		Map<String,Object> map = threadLocal.get();
		if(null==map){
			return null;
		}
		return map.get(key);
	}
	
	public static void remove(){
		threadLocal.remove();
	}
}

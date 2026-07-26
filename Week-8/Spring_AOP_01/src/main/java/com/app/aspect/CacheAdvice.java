package com.app.aspect;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.jspecify.annotations.Nullable;

public class CacheAdvice implements MethodInterceptor {
	Map<String, Float>cache=new HashMap<String, Float>();
	
	@Override
	public @Nullable Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		String key=invocation.getMethod().getName()+Arrays.toString(invocation.getArguments());
		if(!cache.containsKey(key)) {
			Object retValue=invocation.proceed();
			cache.put(key, (Float)retValue);
			System.out.println("from target method");
			return retValue;
		}
		System.out.println("from cache");
		return cache.get(key);
	}
	

}

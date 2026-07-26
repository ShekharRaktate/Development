package com.app.aspect;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.jspecify.annotations.Nullable;

public class PerformanceMonitoringAdvoice implements MethodInterceptor{
	private long start,end;

	@Override
	public @Nullable Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		start=System.currentTimeMillis();
		Object retValue=invocation.proceed();
		end= System.currentTimeMillis();
		System.out.println(invocation.getMethod().getName()+" with args "+Arrays.toString(invocation.getArguments())+"has taken "+(end-start)+"ms for Excution");
		return retValue;
	}
	

}

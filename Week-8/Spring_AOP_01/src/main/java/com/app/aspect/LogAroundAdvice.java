package com.app.aspect;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.jspecify.annotations.Nullable;

public class LogAroundAdvice implements MethodInterceptor {

	@Override
	public @Nullable Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Entering into: "+invocation.getMethod().getName()+" SWith arguments"+Arrays.toString(invocation.getArguments()));
		Object args[]=invocation.getArguments();
		if((Float)args[0]<=5000)
			args[1]=(Float)args[1]-1;
		Object retValue=null;
		if((Float)args[0]<=0.0f||(Float)args[1]<=0.0f||(Float)args[2]<=0.0f) {
			throw new IllegalArgumentException("Invalid args in the method call");
		}else {
			retValue=invocation.proceed();
		}
		if((Float)retValue>=10000) 
			retValue=(Float)retValue+(Float)retValue*0.1f;
			System.out.println("Leaving from "+invocation.getMethod().getName()+"with arguments"+Arrays.toString(invocation.getArguments()));

		return retValue;
	}

	
}

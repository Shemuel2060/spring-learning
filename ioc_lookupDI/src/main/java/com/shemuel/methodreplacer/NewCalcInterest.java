package com.shemuel.methodreplacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewCalcInterest implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		// TODO add new implementations here...
		
		System.out.println("New Calculate interest implementation.");
		return obj;
	}

}

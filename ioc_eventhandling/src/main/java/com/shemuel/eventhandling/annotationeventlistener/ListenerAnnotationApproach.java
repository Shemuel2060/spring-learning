package com.shemuel.eventhandling.annotationeventlistener;

import org.springframework.context.event.EventListener;

public class ListenerAnnotationApproach {
	
	@EventListener // use this instead of implementing ApplictionListener<E>
	/*  Can handle application events in a single class*/
	public void iocStartedListener() {
		System.out.println();
	}
	
	@EventListener
	public void refreshListener() {
		System.out.println();
	}
	
	@EventListener
	public void stopLister() {
		System.out.println();
	}
	
	@EventListener
	public void closedListener() {
		System.out.println();
	}

}

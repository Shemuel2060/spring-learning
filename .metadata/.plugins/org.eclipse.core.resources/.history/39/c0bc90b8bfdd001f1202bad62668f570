package com.shemuel.jdk_autowiring;

import jakarta.annotation.Resource;
import jakarta.inject.Inject;
import jakarta.inject.Named;

public class Car {

//	@Resource // byName only

	@Inject // byType - like the @Autowired, also may need @Qualifier or @Named("engine") to resolve conflicts
	private Engine engine;

	public void printEngine() {
		System.out.println("Engine: " + getEngine());
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}

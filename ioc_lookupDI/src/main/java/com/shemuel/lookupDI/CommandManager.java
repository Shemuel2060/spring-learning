package com.shemuel.lookupDI;

public abstract class CommandManager {

	public void process() {

		Command command = createCommand();

		System.out.println(command.getCommand());

	}

	// okay... but where is the implementation of this method?
	protected abstract Command createCommand();
}

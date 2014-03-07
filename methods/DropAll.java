package methods;

import org.parabot.environment.scripts.framework.Strategy;
import org.soulsplit.api.methods.Inventory;

public class DropAll implements Strategy {

	@Override
	public boolean activate() {
		if (Inventory.isFull()) {
			System.out.println("Checking: Inv full?");
			return true;
		}
		return false;
	}

	@Override
	public void execute() {
		System.out.println("Inv full: dropping");
		Inventory.clear();
	}

}

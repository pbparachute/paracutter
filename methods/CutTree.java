package methods;

import org.parabot.environment.scripts.framework.Strategy;
import org.soulsplit.api.methods.Inventory;
import org.soulsplit.api.methods.Players;
import org.soulsplit.api.methods.SceneObjects;
import org.soulsplit.api.methods.Skill;
import org.soulsplit.api.wrappers.SceneObject;

import paracutter.Data;

public class CutTree implements Strategy {

	@Override
	public boolean activate() {
		if (Skill.WOODCUTTING.getRealLevel() < 15) {
			if (!Inventory.isFull()) {
				if (Players.getMyPlayer().getAnimation() == -1) {
					System.out.println("Cutting tree");
					return true;
				}
			}
		}

		return false;
	}

	   @Override
	    public void execute() {
	        if (SceneObjects.getNearest(Data.tree) != null) {
	            SceneObject[] trees = SceneObjects.getNearest(Data.tree);
	            for (SceneObject tree : trees){
	                if (tree != null){
	                    tree.interact(0);
	                    System.out.println("Cutting tree");
	                }
	            }
	        }
	    }
}

package paracutter;

import java.util.ArrayList;

import methods.CutTree;
import methods.DropAll;

import org.parabot.environment.scripts.Category;
import org.parabot.environment.scripts.Script;
import org.parabot.environment.scripts.ScriptManifest;
import org.parabot.environment.scripts.framework.Strategy;

@ScriptManifest(author = "parachute", category = Category.WOODCUTTING, description = "Powerchopper", name = "paraCutter", servers = { "Soulsplit" }, version = 1.0)
public class Core extends Script {
	static ArrayList<Strategy> jobs = new ArrayList<>();

	@Override
	public boolean onExecute() {
		System.out.println("started");
		jobs.add(new CutTree());
		System.out.println("working");
		jobs.add(new DropAll());
		System.out.println("working2");
		provide(jobs);
		return true;
	}

	@Override
	public void onFinish() {

	}

}

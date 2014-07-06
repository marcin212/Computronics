package pl.asie.computronics.cc;

import java.util.HashMap;

import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import dan200.computercraft.api.ComputerCraftAPI;
import dan200.computercraft.api.peripheral.IPeripheral;
import dan200.computercraft.api.turtle.ITurtleAccess;
import dan200.computercraft.api.turtle.ITurtleUpgrade;
import dan200.computercraft.api.turtle.TurtleCommandResult;
import dan200.computercraft.api.turtle.TurtleSide;
import dan200.computercraft.api.turtle.TurtleUpgradeType;
import dan200.computercraft.api.turtle.TurtleVerb;

public abstract class TurtleUpgradeBase implements ITurtleUpgrade {
	private int upgradeID;
	
	public TurtleUpgradeBase(int id) {
		ComputerCraftAPI.registerTurtleUpgrade(this);
		upgradeID = id;
	}
	
	@Override
	public int getUpgradeID() {
		return upgradeID;
	}

	@Override
	public TurtleUpgradeType getType() {
		return TurtleUpgradeType.Peripheral;
	}

	@Override
	public TurtleCommandResult useTool(ITurtleAccess turtle, TurtleSide side,
			TurtleVerb verb, int direction) {
		return null;
	}

	@Override
	public void update(ITurtleAccess turtle, TurtleSide side) {
	}
}
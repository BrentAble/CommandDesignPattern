package commandDesignPattern;
/**
 * @author brentable
 */
public class fireCommand {
	private Player player;
	/**
	 * @param player implements interface
	 */
	
	public fireCommand(Player player) {
		this.player = player;
	}
	
	public void execute() {
		player.fire();
	}
	
	public String getCommand() {
		return "Fire";
	}
	/**
	 * methods from interface
	 */
}

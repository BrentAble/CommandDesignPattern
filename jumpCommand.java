package commandDesignPattern;
/**
 * @author brentable
 */
public class jumpCommand implements Command {
	private Player player;
	/**
	 * @param player implements interface
	 */
	
	public jumpCommand(Player player) {
		this.player = player;
	}
	
	public void execute() {
		player.jump();
	}
	
	public String getCommand() {
		return "Jump";
	}
	/**
	 * methods from interface
	 */
}

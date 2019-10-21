package commandDesignPattern;
/**
 * @author brentable
 */
public class runCommand {
	private Player player;
	/**
	 * @param player implements interface
	 */
	
	public runCommand(Player player) {
		this.player = player;
	}
	
	public void execute() {
		player.runForward();
	}
	
	public String getCommand() {
		return "Run";
	}
	/**
	 * methods from interface
	 */
}

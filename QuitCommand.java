package commandDesignPattern;
/**
 * @author brentable
 */
public class QuitCommand {
	private Player player;
	/**
	 * @param player implements interface
	 */
	
	public QuitCommand(Player player) {
		this.player = player;
	}
	
	public void execute() {
		System.exit(0);
	}
	
	public String getCommand() {
		return "Goodbye";
	}
	/**
	 * methods from interface
	 */
}

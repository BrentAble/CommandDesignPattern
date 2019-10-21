package commandDesignPattern;
/**
 * Author @ Brent Able
 */
import java.util.HashMap;
import java.util.Map;

public class InputHandler {
	
	private HashMap<String, Player> commands = new HashMap<>();
	
	public InputHandler(Player player) {
		commands.put("Jump", new Player());
	}
	
	public void buttonPressed(String button) {
		
	}
}

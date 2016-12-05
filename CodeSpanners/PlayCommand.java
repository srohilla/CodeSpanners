/**
 *  Class that implements Command and 
 *  executes the action of launching the game world
 */
public class PlayCommand implements Command {

private Receiver r;


public void setReceiver(Receiver r1){
    this.r = r1;
}

	public void execute() {
		this.r.doAction();
	}
	
}

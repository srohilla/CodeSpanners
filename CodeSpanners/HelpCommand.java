public class HelpCommand implements Command {

private Receiver r;

private HelpButton hb;
private HelpCommand hc;
public void setReceiver(Receiver r1){
    this.r = r1;
}

	public void execute() {
		this.r.doAction();
	}
	
}

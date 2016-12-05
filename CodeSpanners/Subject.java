/**
 * Subject class for Observer Pattern
 */
public interface Subject  
{
    // instance variables - replace the example below with your own
    public abstract void attach(Observer obj);
	public abstract void detach(Observer obj);
	public abstract void notifyObservers();
}

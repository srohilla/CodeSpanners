/**
 * Write a description of class Subject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Subject  
{
    // instance variables - replace the example below with your own
    public abstract void attach(Observer obj);
	public abstract void detach(Observer obj);
	public abstract void notifyObservers();
}

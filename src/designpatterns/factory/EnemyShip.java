package designpatterns.factory;

public abstract class EnemyShip {

	private String name;
	public abstract String getName();
	public abstract void setName(String name);

    public abstract void followHero();
	public abstract void distroyShip();
	
}

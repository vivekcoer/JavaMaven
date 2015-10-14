package generics.typeinference;

public class Box <U> {
	private U someproperty;

	public void set(U someproperty) {
		this.someproperty = someproperty;
	}

	public U get() {
		return someproperty;
	}
}

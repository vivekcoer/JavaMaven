package interviews;

public class ClassA {
	private String _name;
	private Integer _daysWorked;	

	public ClassA(String _name, Integer _daysWorked) {
		super();
		this._name = _name;
		this._daysWorked = _daysWorked;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public Integer get_daysWorked() {
		return _daysWorked;
	}

	public void set_daysWorked(Integer _daysWorked) {
		this._daysWorked = _daysWorked;
	}

}

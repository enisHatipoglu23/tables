package tables.hmwrk;

public class Class1 {
	String annotation;
	String retention;
	String target;
	double price;
	
	
	public Class1(String annotation, String retention, String target, double price) {
		super();
		this.annotation = annotation;
		this.retention = retention;
		this.target = target;
		this.price = price;
	}

	int takes() {
		return 0;
		
	}

	public String getAnnotation() {
		return annotation;
	}

	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}

	public String getRetention() {
		return retention;
	}

	public void setRetention(String retention) {
		this.retention = retention;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

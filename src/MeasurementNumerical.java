import java.util.Date;
import javax.persistence.Entity;

//@Entity(name = "pomiar")
public class MeasurementNumerical extends Measurement {
	
	private double value;
	
	/*
	public MeasurementNumerical(Result result, Employee masurementDoneBy, Date masurmentDate, Double value){
		super(result, masurementDoneBy, masurmentDate);
		this.value = value;
	}
	*/
	
	/*
	public String toString() {
		try {
			return "Measurement: " + value;
			//return "Measurement: " + value + ", by: " + this.getLinks("employee")[0];
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return null;
	}
	*/

	public MeasurementNumerical(double idMeasurement, Date measurementDate, double value) {
		super(idMeasurement, measurementDate);
		this.value = value;
	}

	@Override
	public String toString() {
		return "MeasurementNumerical [value=" + value + ", measurementDate=" + measurementDate + "]";
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
}

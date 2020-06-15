import java.util.Date;

public /*abstract*/ class Measurement extends MyExtension {
	//Employee masurementDoneBy;
	private double idMeasurement;
	Date measurementDate; 
	
	public String toString() {
		//return "Measurement: " + masurmentDate.toLocaleString() + ", by: " + masurementDoneBy; 
		try {
			return "Measurement: " + measurementDate.toLocaleString();
			//return "Measurement: " + masurmentDate.toLocaleString() + ", by: " + this.getLinks("employee")[0];
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(r1.getLinkedObject("employee",e3));
		return null;
	}
	
	/*
	Measurement(Result result, Employee masurementDoneBy, Date masurmentDate) {
		//this.masurementDoneBy = masurementDoneBy;
		//this.addLink("employee","measurement", masurementDoneBy);
		//this.addLink("result", "measurement", result);
		this.masurmentDate = masurmentDate;
	}
	*/
	
	Measurement(double idMeasurement, Date measurementDate){
		this.idMeasurement = idMeasurement;
		this.measurementDate = measurementDate;
	}

	public double getIdMeasurement() {
		return idMeasurement;
	}

	public void setIdMeasurement(double idMeasurement) {
		this.idMeasurement = idMeasurement;
	}

	public Date getMeasurementDate() {
		return measurementDate;
	}

	public void setMeasurementDate(Date measurementDate) {
		this.measurementDate = measurementDate;
	}
	
}

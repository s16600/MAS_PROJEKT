import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

public class DOSTAWCA
{
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	private long ID_DOSTAWCA;
	public long getID_DOSTAWCA()
	{
		return this.ID_DOSTAWCA;
	}
	public void setID_DOSTAWCA(long value)
	{
		this.ID_DOSTAWCA = value;
	}

	private String NAZWA;
	public String getNAZWA()
	{
		return this.NAZWA;
	}
	public void setNAZWA(String value)
	{
		this.NAZWA = value;
	}

	private String MIASTO;
	public String getMIASTO()
	{
		return this.MIASTO;
	}
	public void setMIASTO(String value)
	{
		this.MIASTO = value;
	}

	private String ULICA;
	public String getULICA()
	{
		return this.ULICA;
	}
	public void setULICA(String value)
	{
		this.ULICA = value;
	}

	private String NR_DOMU_LOKALU;
	public String getNR_DOMU_LOKALU()
	{
		return this.NR_DOMU_LOKALU;
	}
	public void setNR_DOMU_LOKALU(String value)
	{
		this.NR_DOMU_LOKALU = value;
	}

	public DOSTAWCA() {}
	
	public DOSTAWCA(long ID_DOSTAWCA_,String NAZWA_,String MIASTO_,String ULICA_,String NR_DOMU_LOKALU_)
	{
		this.ID_DOSTAWCA = ID_DOSTAWCA_;
		this.NAZWA = NAZWA_;
		this.MIASTO = MIASTO_;
		this.ULICA = ULICA_;
		this.NR_DOMU_LOKALU = NR_DOMU_LOKALU_;
	}
}
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "pomiar")
public class POMIAR
{
	
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	private long ID_POMIAR;
	public long getID_POMIAR()
	{
		return this.ID_POMIAR;
	}
	public void setID_POMIAR(long value)
	{
		this.ID_POMIAR = value;
	}

	private long WYNIK_ID_WYNIK;
	public long getWYNIK_ID_WYNIK()
	{
		return this.WYNIK_ID_WYNIK;
	}
	public void setWYNIK_ID_WYNIK(long value)
	{
		this.WYNIK_ID_WYNIK = value;
	}

	private String TYP_POMIAR;
	public String getTYP_POMIAR()
	{
		return this.TYP_POMIAR;
	}
	public void setTYP_POMIAR(String value)
	{
		this.TYP_POMIAR = value;
	}

	private Double WARTOSC_NUM;
	public Double getWARTOSC_NUM()
	{
		return this.WARTOSC_NUM;
	}
	public void setWARTOSC_NUM(Double value)
	{
		this.WARTOSC_NUM = value;
	}

	private Boolean WARTOSC_BOOL;
	public boolean getWARTOSC_BOOL()
	{
		return this.WARTOSC_BOOL;
	}
	public void setWARTOSC_BOOL(boolean value)
	{
		this.WARTOSC_BOOL = value;
	}

	private String WARTOSC_STR;
	public String getWARTOSC_STR()
	{
		return this.WARTOSC_STR;
	}
	public void setWARTOSC_STR(String value)
	{
		this.WARTOSC_STR = value;
	}

	private String WARTOSC_ENUM;
	public String getWARTOSC_ENUM()
	{
		return this.WARTOSC_ENUM;
	}
	public void setWARTOSC_ENUM(String value)
	{
		this.WARTOSC_ENUM = value;
	}

	
	public POMIAR() {}
	
	public POMIAR(long ID_POMIAR_,long WYNIK_ID_WYNIK_,String TYP_POMIAR_,Double WARTOSC_NUM_,boolean WARTOSC_BOOL_,
			String WARTOSC_STR_,String WARTOSC_ENUM_)
	{
		this.ID_POMIAR = ID_POMIAR_;
		this.WYNIK_ID_WYNIK = WYNIK_ID_WYNIK_;
		this.TYP_POMIAR = TYP_POMIAR_;
		this.WARTOSC_NUM = WARTOSC_NUM_;
		this.WARTOSC_BOOL = WARTOSC_BOOL_;
		this.WARTOSC_STR = WARTOSC_STR_;
		this.WARTOSC_ENUM = WARTOSC_ENUM_;
	}
	
	@Override
	public String toString() {
		return "POMIAR [ID_POMIAR=" + ID_POMIAR + ", WARTOSC_NUM=" + WARTOSC_NUM + "]";
	}
	
	
}
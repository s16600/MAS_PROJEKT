import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Entity(name = "proba")
public class PROBA
{
	
	public static PROBA find(long id) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session session =sessionFactory.openSession();
	    PROBA proba = (PROBA) session.createQuery("from PROBA where ID_PROBA="+id).uniqueResult();
	    session.close();
		return proba;
	}
	
	@Id
	private long ID_PROBA;
	public long getID_PROBA()
	{
		return this.ID_PROBA;
	}
	public void setID_PROBA(long value)
	{
		this.ID_PROBA = value;
	}

	private String NR_PROBY;
	public String getNR_PROBY()
	{
		return this.NR_PROBY;
	}
	public void setNR_PROBY(String value)
	{
		this.NR_PROBY = value;
	}

	private String NR_SERII;
	public String getNR_SERII()
	{
		return this.NR_SERII;
	}
	public void setNR_SERII(String value)
	{
		this.NR_SERII = value;
	}

	private long SPECYFIKACJA_ID_SPECYFIKACJI;
	public long getSPECYFIKACJA_ID_SPECYFIKACJI()
	{
		return this.SPECYFIKACJA_ID_SPECYFIKACJI;
	}
	public void setSPECYFIKACJA_ID_SPECYFIKACJI(long value)
	{
		this.SPECYFIKACJA_ID_SPECYFIKACJI = value;
	}

	private String NR_SERII_WYTWORCY;
	public String getNR_SERII_WYTWORCY()
	{
		return this.NR_SERII_WYTWORCY;
	}
	public void setNR_SERII_WYTWORCY(String value)
	{
		this.NR_SERII_WYTWORCY = value;
	}

	private long DOSTAWCA_ID_DOSTAWCA;
	public long getDOSTAWCA_ID_DOSTAWCA()
	{
		return this.DOSTAWCA_ID_DOSTAWCA;
	}
	public void setDOSTAWCA_ID_DOSTAWCA(long value)
	{
		this.DOSTAWCA_ID_DOSTAWCA = value;
	}

	private long ETAP_PROD_ID_ETAP_PROD;
	public long getETAP_PROD_ID_ETAP_PROD()
	{
		return this.ETAP_PROD_ID_ETAP_PROD;
	}
	public void setETAP_PROD_ID_ETAP_PROD(long value)
	{
		this.ETAP_PROD_ID_ETAP_PROD = value;
	}

	private long TYP_PROBY_ID_TYP_PROBY;
	public long getTYP_PROBY_ID_TYP_PROBY()
	{
		return this.TYP_PROBY_ID_TYP_PROBY;
	}
	public void setTYP_PROBY_ID_TYP_PROBY(long value)
	{
		this.TYP_PROBY_ID_TYP_PROBY = value;
	}

	private java.sql.Date DATA_POBORU;
	public java.sql.Date getDATA_POBORU()
	{
		return this.DATA_POBORU;
	}
	public void setDATA_POBORU(java.sql.Date value)
	{
		this.DATA_POBORU = value;
	}

	private java.sql.Date DATA_PRODUKCJI;
	public java.sql.Date getDATA_PRODUKCJI()
	{
		return this.DATA_PRODUKCJI;
	}
	public void setDATA_PRODUKCJI(java.sql.Date value)
	{
		this.DATA_PRODUKCJI = value;
	}

	private java.sql.Date DATA_WAZNOSCI;
	public java.sql.Date getDATA_WAZNOSCI()
	{
		return this.DATA_WAZNOSCI;
	}
	public void setDATA_WAZNOSCI(java.sql.Date value)
	{
		this.DATA_WAZNOSCI = value;
	}

	private Boolean SPRAWDZONA;
	public boolean getSPRAWDZONA()
	{
		return this.SPRAWDZONA;
	}
	public void setSPRAWDZONA(boolean value)
	{
		this.SPRAWDZONA = value;
	}

	private java.sql.Timestamp DATA_SPRAWDZENIA;
	public java.sql.Timestamp getDATA_SPRAWDZENIA()
	{
		return this.DATA_SPRAWDZENIA;
	}
	public void setDATA_SPRAWDZENIA(java.sql.Timestamp value)
	{
		this.DATA_SPRAWDZENIA = value;
	}

	private Long OCENA_ID_OCENA;
	public long getOCENA_ID_OCENA()
	{
		return this.OCENA_ID_OCENA;
	}
	public void setOCENA_ID_OCENA(long value)
	{
		this.OCENA_ID_OCENA = value;
	}

	private java.sql.Timestamp DATA_OCENY;
	public java.sql.Timestamp getDATA_OCENY()
	{
		return this.DATA_OCENY;
	}
	public void setDATA_OCENY(java.sql.Timestamp value)
	{
		this.DATA_OCENY = value;
	}

	public PROBA() {}
	
	public PROBA(long ID_PROBA_,String NR_PROBY_,String NR_SERII_,long SPECYFIKACJA_ID_SPECYFIKACJI_,String NR_SERII_WYTWORCY_,long DOSTAWCA_ID_DOSTAWCA_,long ETAP_PROD_ID_ETAP_PROD_,long TYP_PROBY_ID_TYP_PROBY_,java.sql.Date DATA_POBORU_,java.sql.Date DATA_PRODUKCJI_,java.sql.Date DATA_WAZNOSCI_,boolean SPRAWDZONA_,java.sql.Timestamp DATA_SPRAWDZENIA_,long OCENA_ID_OCENA_,java.sql.Timestamp DATA_OCENY_)
	{
		this.ID_PROBA = ID_PROBA_;
		this.NR_PROBY = NR_PROBY_;
		this.NR_SERII = NR_SERII_;
		this.SPECYFIKACJA_ID_SPECYFIKACJI = SPECYFIKACJA_ID_SPECYFIKACJI_;
		this.NR_SERII_WYTWORCY = NR_SERII_WYTWORCY_;
		this.DOSTAWCA_ID_DOSTAWCA = DOSTAWCA_ID_DOSTAWCA_;
		this.ETAP_PROD_ID_ETAP_PROD = ETAP_PROD_ID_ETAP_PROD_;
		this.TYP_PROBY_ID_TYP_PROBY = TYP_PROBY_ID_TYP_PROBY_;
		this.DATA_POBORU = DATA_POBORU_;
		this.DATA_PRODUKCJI = DATA_PRODUKCJI_;
		this.DATA_WAZNOSCI = DATA_WAZNOSCI_;
		this.SPRAWDZONA = SPRAWDZONA_;
		this.DATA_SPRAWDZENIA = DATA_SPRAWDZENIA_;
		this.OCENA_ID_OCENA = OCENA_ID_OCENA_;
		this.DATA_OCENY = DATA_OCENY_;
	}
}
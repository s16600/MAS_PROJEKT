import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.cfg.Configuration;

@Entity(name = "specyfikacja")
public class SPECYFIKACJA
{
	public static SPECYFIKACJA find(long id) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    SPECYFIKACJA specyfikacja = (SPECYFIKACJA) session.createQuery("from SPECYFIKACJA where ID_SPECYFIKACJI="+id).uniqueResult();
	    session.close();
		return specyfikacja;
	}
	
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	private long ID_SPECYFIKACJI;
	public long getID_SPECYFIKACJI()
	{
		return this.ID_SPECYFIKACJI;
	}
	public void setID_SPECYFIKACJI(long value)
	{
		this.ID_SPECYFIKACJI = value;
	}

	private String NAZWA_MATERIALU;
	public String getNAZWA_MATERIALU()
	{
		return this.NAZWA_MATERIALU;
	}
	public void setNAZWA_MATERIALU(String value)
	{
		this.NAZWA_MATERIALU = value;
	}

	private String SYMBOL_SPECYFIKACJI;
	public String getSYMBOL_SPECYFIKACJI()
	{
		return this.SYMBOL_SPECYFIKACJI;
	}
	public void setSYMBOL_SPECYFIKACJI(String value)
	{
		this.SYMBOL_SPECYFIKACJI = value;
	}

	public SPECYFIKACJA() {}
	
	public SPECYFIKACJA(long ID_SPECYFIKACJI_,String NAZWA_MATERIALU_,String SYMBOL_SPECYFIKACJI_)
	{
		this.ID_SPECYFIKACJI = ID_SPECYFIKACJI_;
		this.NAZWA_MATERIALU = NAZWA_MATERIALU_;
		this.SYMBOL_SPECYFIKACJI = SYMBOL_SPECYFIKACJI_;
	}
}
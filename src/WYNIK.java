import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.swing.table.DefaultTableModel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.cfg.Configuration;

@Entity(name = "wynik")
public class WYNIK
{
	
	@Transient
	public List<POMIAR> pomiary;
	
	public static WYNIK find(long id) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session session =sessionFactory.openSession();
	    WYNIK wynik = (WYNIK) session.createQuery("from WYNIK where ID_WYNIK="+id).uniqueResult();
	    session.close();
		return wynik;
	}
	
	public static List<WYNIK> findAllForSample(long id) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session session =sessionFactory.openSession();
	    List<WYNIK> wyniki = session.createQuery("from WYNIK where PROBA_ID_PROBA="+id).list();
	    session.close();
		return wyniki;
	}
	
	/*
	public static List<POMIAR> findPomiary(long id) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session session =sessionFactory.openSession();
	    //WYNIK wynik = (WYNIK) session.createQuery("from WYNIK where ID_WYNIK="+id).uniqueResult();
	    List<POMIAR> pomiary1 = session.createQuery("from POMIAR where WYNIK_ID_WYNIK="+id).list();
	    session.close();
		return pomiary1;
	}
	*/

	public PROBA proba() {
		PROBA proba = PROBA.find(getPROBA_ID_PROBA());
		return proba;
	}
	
	public SPECYFIKACJA specyfikacja() {
		PROBA proba = PROBA.find(getPROBA_ID_PROBA());
		SPECYFIKACJA specyfikacja = SPECYFIKACJA.find(proba.getSPECYFIKACJA_ID_SPECYFIKACJI());
		return specyfikacja;
	}
	
	public Double calculate() {
		/*
		Double wynik = null;
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session session =sessionFactory.openSession();
	    List<POMIAR> pomiary = session.createQuery("from POMIAR where WYNIK_ID_WYNIK="+ID_WYNIK).list();
	    wynik = (pomiary.stream().mapToDouble(a->a.getWARTOSC_NUM()).average()).getAsDouble();
	    session.close();
		return wynik;
		*/
		if (pomiary.isEmpty()) return 0D;
		return (pomiary.stream().mapToDouble(a->a.getWARTOSC_NUM()).average()).getAsDouble();
	}
		
	public void read(long id) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session session =sessionFactory.openSession();
	    WYNIK wynik = (WYNIK) session.createQuery("from WYNIK where ID_WYNIK="+id).uniqueResult();
	    pomiary = session.createQuery("from POMIAR where WYNIK_ID_WYNIK="+id).list();
	    session.close();
		
		this.ID_WYNIK = wynik.ID_WYNIK;
		this.PROBA_ID_PROBA = wynik.PROBA_ID_PROBA;
		this.TYP = wynik.TYP;
		this.NAZWA = wynik.NAZWA;
		this.WYMAGANIA = wynik.WYMAGANIA;
		this.UWAGI = wynik.UWAGI;
		this.SPRAWDZONY = wynik.SPRAWDZONY;
		this.DATA_SPRAWDZENIA = wynik.DATA_SPRAWDZENIA;
		this.PRACOWNIK_ID_PRACOWNIKA = wynik.PRACOWNIK_ID_PRACOWNIKA;
		this.JEDN_MIARY_ID_JEDN_MIARY = wynik.JEDN_MIARY_ID_JEDN_MIARY;
		this.URZADZENIE_ID_URZADZENIA = wynik.URZADZENIE_ID_URZADZENIA;
	}
	
	public void write() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session session =sessionFactory.openSession();
	    Transaction tx = session.beginTransaction();
	    
	    int deletedEntities = session.createQuery( "delete from POMIAR where WYNIK_ID_WYNIK="+this.ID_WYNIK ).executeUpdate();
	    
	    for(POMIAR p : pomiary) session.save(p);
	    
	    tx.commit();
	    session.close();
	}
	
	
	/*
	 * 				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		    Session session =sessionFactory.openSession();

		    WYNIK W = (WYNIK) session.createQuery("from WYNIK where ID_WYNIK=2").uniqueResult();
		    
		    //WYNIK W = (WYNIK) session.createQuery("SELECT * FROM wynik WHERE id_wynik=1").list().get(1);
		    
		    //List<WYNIK> wyniki = session.createQuery("from WYNIK").list();
		    System.out.println(W);
		    
		    DefaultTableModel model = new DefaultTableModel();
	    	model.addColumn("Full Name");
	    	model.addColumn("Email");
	    	tableMeasurements.setModel(model);
		    
	    	int iterator = 1;
		    List<POMIAR> pomiary = session.createQuery("from POMIAR").list();
		    for (POMIAR p : pomiary) {
		    	model.addRow(new Object[]{iterator++,p.getWARTOSC_NUM()});
		    	//System.out.println(p);
		    }
		    
		    session.close();
	 */
	
	
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	private long ID_WYNIK;
	public long getID_WYNIK()
	{
		return this.ID_WYNIK;
	}
	public void setID_WYNIK(long value)
	{
		this.ID_WYNIK = value;
	}

	private long PROBA_ID_PROBA;
	public long getPROBA_ID_PROBA()
	{
		return this.PROBA_ID_PROBA;
	}
	public void setPROBA_ID_PROBA(long value)
	{
		this.PROBA_ID_PROBA = value;
	}

	private String TYP;
	public String getTYP()
	{
		return this.TYP;
	}
	public void setTYP(String value)
	{
		this.TYP = value;
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

	private String WYMAGANIA;
	public String getWYMAGANIA()
	{
		return this.WYMAGANIA;
	}
	public void setWYMAGANIA(String value)
	{
		this.WYMAGANIA = value;
	}

	private String UWAGI;
	public String getUWAGI()
	{
		return this.UWAGI;
	}
	public void setUWAGI(String value)
	{
		this.UWAGI = value;
	}

	private boolean SPRAWDZONY;
	public boolean getSPRAWDZONY()
	{
		return this.SPRAWDZONY;
	}
	public void setSPRAWDZONY(boolean value)
	{
		this.SPRAWDZONY = value;
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

	private long PRACOWNIK_ID_PRACOWNIKA;
	public long getPRACOWNIK_ID_PRACOWNIKA()
	{
		return this.PRACOWNIK_ID_PRACOWNIKA;
	}
	public void setPRACOWNIK_ID_PRACOWNIKA(long value)
	{
		this.PRACOWNIK_ID_PRACOWNIKA = value;
	}

	private long JEDN_MIARY_ID_JEDN_MIARY;
	public long getJEDN_MIARY_ID_JEDN_MIARY()
	{
		return this.JEDN_MIARY_ID_JEDN_MIARY;
	}
	public void setJEDN_MIARY_ID_JEDN_MIARY(long value)
	{
		this.JEDN_MIARY_ID_JEDN_MIARY = value;
	}

	private long URZADZENIE_ID_URZADZENIA;
	public long getURZADZENIE_ID_URZADZENIA()
	{
		return this.URZADZENIE_ID_URZADZENIA;
	}
	public void setURZADZENIE_ID_URZADZENIA(long value)
	{
		this.URZADZENIE_ID_URZADZENIA = value;
	}

	public WYNIK() {}
	
	public WYNIK(long ID_WYNIK_,long PROBA_ID_PROBA_,String TYP_,String NAZWA_,String WYMAGANIA_,String UWAGI_,boolean SPRAWDZONY_,java.sql.Timestamp DATA_SPRAWDZENIA_,long PRACOWNIK_ID_PRACOWNIKA_,long JEDN_MIARY_ID_JEDN_MIARY_,long URZADZENIE_ID_URZADZENIA_)
	{
		this.ID_WYNIK = ID_WYNIK_;
		this.PROBA_ID_PROBA = PROBA_ID_PROBA_;
		this.TYP = TYP_;
		this.NAZWA = NAZWA_;
		this.WYMAGANIA = WYMAGANIA_;
		this.UWAGI = UWAGI_;
		this.SPRAWDZONY = SPRAWDZONY_;
		this.DATA_SPRAWDZENIA = DATA_SPRAWDZENIA_;
		this.PRACOWNIK_ID_PRACOWNIKA = PRACOWNIK_ID_PRACOWNIKA_;
		this.JEDN_MIARY_ID_JEDN_MIARY = JEDN_MIARY_ID_JEDN_MIARY_;
		this.URZADZENIE_ID_URZADZENIA = URZADZENIE_ID_URZADZENIA_;
	}
	
	@Override
	public String toString() {
		return "WYNIK [ID_WYNIK=" + ID_WYNIK + ", NAZWA=" + NAZWA + ", WYMAGANIA=" + WYMAGANIA + "]";
	}
	
}
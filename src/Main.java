import java.awt.EventQueue;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SamplesList window = new SamplesList();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		//System.out.println("*** Koniec programu projekt MAS ***");
	}

}

/*
 * 1. połącznie z bazą, plik hibernate.cfg.xml
 * 2. import dla każdej klasy, klasa.hbm.xml
 * 3. klasa, która będzie importować dane z getterami i setterami
 * 4. używanie bazy
 */

/* PLIK: book.hbm.xml
 
 <?xml version='1.0' encoding='UTF-8'?>  
<!DOCTYPE hibernate-mapping PUBLIC  
 "-//Hibernate/Hibernate Mapping DTD 3.0//EN"  
 "http://hibernate.sourceforge.net/hibernate-mapping-3.0.dtd">  
  
 <hibernate-mapping>  
  <class name="book" table="book">  
  
      <id name = "book_id" type = "int" column = "book_id">
         <generator class="native"/>
      </id>
      
      <property name = "book_author_id" column = "book_author_id" type = "int"/>
      <property name = "book_title" column = "book_title" type = "string"/>
      <property name = "book_year" column = "book_year" type = "string"/>
            
  </class>  
            
 </hibernate-mapping>  
 
 
 */

/* KORZYSTANIE Z BAZY
    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
      
    SessionFactory factory = meta.getSessionFactoryBuilder().build();  
    Session session = factory.openSession();  
    Transaction t = session.beginTransaction();  
      
     book b1=new book();    
        b1.setBook_id(7);    
        b1.setBook_author_id(1);
        b1.setBook_title("Nowa książka");
        b1.setBook_year("1951");
   
     
   session.save(b1);  
   t.commit();  
   System.out.println("successfully saved");    
   factory.close();  
   session.close();  
 */


package hw;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibenateXMLConfStarter {
public static void main(String[] args) {
	
	//create configuration object with credentionts to DB
	Configuration configuration = new Configuration();
	configuration.configure("hibernate.cnf.xml");

	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties()).build();
	
	SessionFactory factory = configuration.buildSessionFactory();
	
	Session session = factory.openSession();
	
	Transaction transaction = session.beginTransaction();
	
//	create
//	Person person = new Person("Max", "Original", 13);
//	session.persist(person);
	
//	search for one object
//	Person personeFromDB = session.get(Person.class, 2);
//	System.out.println(personeFromDB);

	
	//show all Persons from DB
//	CriteriaQuery<Person> criteria = session.getCriteriaBuilder().createQuery(Person.class);
//	criteria.from(Person.class);
//	
//	List<Person> ListOfPersons = session.createQuery(criteria).getResultList();
//	
//	System.out.println(ListOfPersons);
	
	//update entity
//	Person personForUpdate = (Person) session.get(Person.class, 1);
//	personForUpdate.setAge(66);
//	session.persist(personForUpdate);

	//delete
//	Person personForDelete = (Person) session.get(Person.class, 1);
//	
//	session.delete(personForDelete);

	//add cars to user
//	Person person = new Person("Max","Original",66);
//	Car car = new Car("AUDI");
//	Car car2 = new Car("BMW");
//	person.setCars(new HashSet<Car>(Arrays.asList(car,car2)));
//	session.persist(person);
	
	Cart cart = new Cart("13", "Max");
	
	Item item = new Item("zero");
	Item item1 = new Item("one");
	Item item2 = new Item("two");
	Item item3 = new Item("tree");
	
	cart.setItems(new HashSet<Item>(Arrays.asList(item,item2,item1,item3)));
	session.persist(cart);
	
	transaction.commit();
	
	session.close();
}
}

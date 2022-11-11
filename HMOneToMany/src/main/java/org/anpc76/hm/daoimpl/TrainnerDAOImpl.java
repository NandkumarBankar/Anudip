package org.anpc76.hm.daoimpl;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.anpc76.hm.Entity.Learner;
import org.anpc76.hm.Entity.Trainer;
import org.anpc76.hm.config.HibernateUtil;
import org.anpc76.hm.dao.TrainerDao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction.LEAST;



public class TrainnerDAOImpl implements TrainerDao {

	@Override
	public void insert() {
			
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction  t=session.beginTransaction();
			
			Learner l1=new Learner();
			l1.setSid(1);
			l1.setSname("Nandu");
			l1.setsAddr("Shirdi");
			l1.setSphone(880574860);
			l1.setSedu("MTech");
			
			Learner l2=new Learner();
			l2.setSid(2);
			l2.setSname("Satish");
			l2.setsAddr("Rahuri");
			l2.setSphone(911217995);
			l2.setSedu("MTech");
			
			Learner l3=new Learner();
			l3.setSid(3);
			l3.setSname("Pravin");
			l3.setsAddr("Beed");
			l3.setSphone(762090256);
			l3.setSedu("MTech");
			
			
			
			
			ArrayList<Learner>li1=new ArrayList<Learner>();
			li1.add(l1);
			li1.add(l2);
			li1.add(l3);
			
			
			
			
			Trainer tr1=new Trainer();
			
			tr1.setTname("Kalai");
			tr1.setTemail("Kalai@Gmail.com");
			tr1.setTsubject("Core Java");
			tr1.setBatchCode("2375");
			
			tr1.setLearner(li1);
			session.save(tr1);
			
			Learner l4=new Learner();
			l4.setSid(4);
			l4.setSname("Vaibhav");
			l4.setsAddr("Nevasa");
			l4.setSphone(986574860);
			l4.setSedu("BTech");
			
			Learner l5=new Learner();
			l5.setSid(5);
			l5.setSname("Kunal");
			l5.setsAddr("Kopergaon");
			l5.setSphone(795617995);
			l5.setSedu("BTech");
			
			Learner l6=new Learner();
			l6.setSid(6);
			l6.setSname("Dhananjay");
			l6.setsAddr("Belapur");
			l6.setSphone(897090256);
			l6.setSedu("BTech");
			
			ArrayList<Learner>li2=new ArrayList<Learner>();
			li2.add(l4);
			li2.add(l5);
			li2.add(l6);
			
			Trainer tr2=new Trainer();
			
			tr2.setTname("Mamta");
			tr2.setTemail("Mamta@Gmail.com");
			tr2.setTsubject("Adv Java");
			tr2.setBatchCode("2376");
			
			tr2.setLearner(li2);
			session.save(tr2);
			t.commit();
		System.err.println("Succesfully Added");
			
		} catch (Exception e) {
			System.out.println(e);		}
	
	}

	@Override
	public void read() {
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			
			TypedQuery<Trainer> query=session.createQuery("from Trainer");
			List<Trainer> all=query.getResultList();
			
			Iterator<Trainer> itr=all.iterator();
			while(itr.hasNext()) {
				Trainer tr=itr.next();
				System.out.println("\n\nTrainner Name : " +tr.getTname() + " , BatchCode : " + tr.getBatchCode()+ "\n\n");
				
				List<Learner>li=tr.getLearner();
				Iterator<Learner>itr1=li.iterator();
				while(itr1.hasNext()) {
					Learner lr=itr1.next();
					System.out.println(lr.getSid()+" \n"+lr.getSname()+"\n"+lr.getsAddr() +"\n"+lr.getSphone()+"\n"+ lr.getSedu() + "\n"
							+lr.getClass());
				}
			}
		} catch (Exception e) {
			System.out.println(e);		}
		
				
	}

	
	
}

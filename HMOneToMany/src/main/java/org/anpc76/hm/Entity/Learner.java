package org.anpc76.hm.Entity;

import java.util.LinkedList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.anpc76.hm.daoimpl.TrainnerDAOImpl;
import org.hibernate.annotations.ManyToAny;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Entity
public class Learner {

	@Id
	private int sid;
	@Column(length = 30,nullable = false)
	private String sname;
	@Column(length = 30,nullable = false)
	private String sedu;
	@Column(length = 10,nullable = false , unique = true)
	private long sphone;
	@Column(length = 30,nullable = false)
	private String sAddr;
	
	// @ManyToOne(targetEntity = Trainer.class)
	//private Trainer trainer;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSedu() {
		return sedu;
	}
	public void setSedu(String sedu) {
		this.sedu = sedu;
	}
	public long getSphone() {
		return sphone;
	}
	public void setSphone(long sphone) {
		this.sphone = sphone;
	}
	public String getsAddr() {
		return sAddr;
	}
	public void setsAddr(String sAddr) {
		this.sAddr = sAddr;
	}
	
	
	
	
	
}

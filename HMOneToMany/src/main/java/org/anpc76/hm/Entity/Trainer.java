package org.anpc76.hm.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
public class Trainer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int tid;
	@Column(length = 30,nullable = false)
	private String tname;
	@Column(length = 30,nullable = false ,unique = true)
	private String temail;
	@Column(length = 30,nullable = false)
	private String tsubject;
	@Column(length = 30,nullable = false)
	private String batchCode;
	
	@OneToMany(targetEntity = Learner.class,cascade=CascadeType.ALL)
	@JoinColumn(name="tid")
	private List<Learner> learner;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTemail() {
		return temail;
	}

	public void setTemail(String temail) {
		this.temail = temail;
	}

	public String getTsubject() {
		return tsubject;
	}

	public void setTsubject(String tsubject) {
		this.tsubject = tsubject;
	}

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public List<Learner> getLearner() {
		return learner;
	}

	public void setLearner(List<Learner> learner) {
		this.learner = learner;
	}

	
	
	
}

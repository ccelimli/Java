package Kodlamaio.Hrms.Entites.Concrete;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import Kodlamaio.Hrms.Entites.Abstract.Entity;
import lombok.Data;

@Data
@Table(name="job_title")
public class Job implements Entity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int Id;
	
	@Column(name="title")
	String title;
	
	public Job() {}
	public Job(int id, String title) {
		super();
		this.Id = id;
		this.title = title;
	}


}

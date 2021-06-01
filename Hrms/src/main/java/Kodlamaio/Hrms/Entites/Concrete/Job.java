package Kodlamaio.Hrms.Entites.Concrete;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import lombok.Data;



@Data
@javax.persistence.Entity
@Table(name="job_title")
public class Job{
	
	@javax.persistence.Id
	@GeneratedValue
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

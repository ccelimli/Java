package Kodlamaio.Hrms.Entites.Concrete;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="user")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	@Getter @Setter
	private int id;
	
	@Getter @Setter
	@Column(name="email")
	private String email;
	
	@Getter @Setter
	@Column(name="password")
	private String password;
	
}

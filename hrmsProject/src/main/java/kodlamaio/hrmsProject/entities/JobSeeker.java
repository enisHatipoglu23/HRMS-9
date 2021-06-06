package kodlamaio.hrmsProject.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import kodlamaio.hrmsProject.entities.abstracts.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name="job_seekers")
@PrimaryKeyJoinColumn(name = "user_id" , referencedColumnName = "id")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker extends User implements Entities{
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "nationality_number")
	private String nationalityNumber;
	
	@Column(name = "birth_date")
	private Date birthDate;
	
	@Column(name="created_date")
	@JsonIgnore
	private LocalDate createdDate=LocalDate.now();
	
	@Column(name="picture_url")
	private String pictureUrl;
	
	///iliskilendirmeler
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobSeeker")
	private List<School> schools;
	
	
	@JsonIgnore
	@OneToMany(mappedBy="jobSeeker")
	private List<Language> languages;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<Link> links;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<Skill> skills;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobExperience> jobExperiences;
	
	
	

	

	
	
}

package kodlamaio.hrmsProject.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "skills")
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int skillId;
	
	@Column(name = "skill_name")
	private String skillName;
	
	@Column(name = "programming_language")
	private String programmingLanguage;
	
	@Column(name = "created_date")
	@JsonIgnore
	private LocalDate createdDate = LocalDate.now();
	
	/// iliskilendirme
	
	@ManyToOne()
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;
	
	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private Cv cv;
	
	

	
}

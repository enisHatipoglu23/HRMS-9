package kodlamaio.hrmsProject.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "schools")
@AllArgsConstructor
@NoArgsConstructor

public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int schoolId;
	
	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "department_name")
	private String departmentName;
	
	@Column(name = "start_year")
	private LocalDate startYear;
	
	@Column(name = "graduation_year")
	private LocalDate graduationYear;
	
	@Column(name = "still_continue")
	private boolean  stillContinue;
	
	/// iliskilendirme
	
	@ManyToOne()
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cv_id")
	private Cv cv;
	
	
	
	
}

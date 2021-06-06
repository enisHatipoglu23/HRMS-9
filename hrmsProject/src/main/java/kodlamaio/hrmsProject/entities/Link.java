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
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "links")
public class Link {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int linkId;
	
	@Column(name = "link_name")	
	private String linkName;
	
	@Column(name = "link_url")
	private String linkUrl;
	
	@Column(name = "created_date")
	@JsonIgnore
	private LocalDate createdDate = LocalDate.now();
	
	///ilisklendirme
	
	@ManyToOne()
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;
	
	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private Cv cv;
	
	
	
	
}

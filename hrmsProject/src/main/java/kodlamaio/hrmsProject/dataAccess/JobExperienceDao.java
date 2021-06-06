package kodlamaio.hrmsProject.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsProject.entities.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience, Integer>{

	List<JobExperience> getAllByJobSeeker_IdOrderByResignationTimeDesc(int jobSeekerId);
	
	List<JobExperience> getAllByJobSeeker_Id(int jobSeekerId);
	
}

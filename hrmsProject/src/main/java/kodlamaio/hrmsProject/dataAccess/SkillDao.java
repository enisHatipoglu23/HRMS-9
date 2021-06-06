package kodlamaio.hrmsProject.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsProject.entities.Skill;

public interface SkillDao extends JpaRepository<Skill, Integer>{

	List<Skill> getAllByJobSeeker_Id(int jobSeekerId);
	
}

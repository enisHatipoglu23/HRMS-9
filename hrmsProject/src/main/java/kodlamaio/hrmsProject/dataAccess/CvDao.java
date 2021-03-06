package kodlamaio.hrmsProject.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrmsProject.entities.Cv;

public interface CvDao extends JpaRepository<Cv, Integer>{

	@Query("From Cv c where c.jobSeeker.id=?1")
	List<Cv> getByCvIdForJobSeekerId(int userId);
}

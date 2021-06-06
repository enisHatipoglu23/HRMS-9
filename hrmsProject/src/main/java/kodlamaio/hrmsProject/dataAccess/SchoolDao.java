package kodlamaio.hrmsProject.dataAccess;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsProject.entities.School;

public interface SchoolDao extends JpaRepository<School, Integer>{

	
	
	List<School> getByStartYearAndGraduationYear(LocalDate startYear, LocalDate graduationYear);
	
	List<School> getByStartYearAndStillContinue(LocalDate startYear, boolean stillContinue);
	
}

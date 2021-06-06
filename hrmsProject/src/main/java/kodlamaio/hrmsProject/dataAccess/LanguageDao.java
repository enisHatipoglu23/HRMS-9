package kodlamaio.hrmsProject.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsProject.entities.Language;

public interface LanguageDao extends JpaRepository<Language, Integer>{

	List<Language> getAllByJobSeeker_Id(int joSeekerId);
	
}

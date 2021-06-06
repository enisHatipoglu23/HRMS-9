package kodlamaio.hrmsProject.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsProject.entities.Link;

public interface LinkDao extends JpaRepository<Link, Integer>{

	List<Link> getAllByJobSeeker_Id(int jobSeeker);
	
}

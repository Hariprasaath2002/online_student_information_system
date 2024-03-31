package studentdetails.online_student_information_system;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personalinfoRepository extends JpaRepository<personalinfoEntity, String> {

}
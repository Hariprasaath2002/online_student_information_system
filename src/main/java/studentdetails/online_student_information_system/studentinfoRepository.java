package studentdetails.online_student_information_system;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
@Repository
public interface studentinfoRepository extends JpaRepository<studentinfoEntity,String>{
        public List<studentinfoEntity> findByStudentClassadvisor(String CA);

        @Transactional
        @Modifying(flushAutomatically = true, clearAutomatically = true)
        @Query(value="UPDATE Backend SET Backend.student_department=?EEE where Backend.studentclassadvisor=:userchoose",nativeQuery = true)
        public void updateByStudentClassadvisor(String userchoose);
        
        public studentinfoEntity findByUsername(String username);
}

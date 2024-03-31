package studentdetails.online_student_information_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class academicservice {
    @Autowired
    academicRepository srepo;

    public academicEntity createsAcademicEntity(academicEntity academicdetails){
        return srepo.save(academicdetails);

    }
    
    public academicEntity makereadone(String mailid){
        return srepo.findById(mailid).orElse(new academicEntity() );
    }
}

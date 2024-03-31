package studentdetails.online_student_information_system;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class academicEntity {
    @Id
    private String emailid;

    private int sem1fromduration;
    private int sem1toduration;
    private String sem1blockname;
    private int sem1roomno;
    private String sem1busstage;
    private String sem1busno;
    private String sem1classadvisorname;
    private int sem1classadvisorno;
    private String sem1studentmentor;
    private String sem1studentmentorcontact;
    //sub1
    private String sem1subjectcode1;
    private String sem1subjectname1;
    private int sem1int1attendance1;
    private int sem1int1marks1;
    private int sem1int2attendace1;
    private int sem1int2marks1;
    private int sem1int3attendance1;
    private int sem1int3marks1;
    //sub2
    private String sem1subjectcode2;
    private String sem1subjectname2;
    private int sem1int1attendance2;
    private int sem1int1marks2;
    private int sem1int2attendace2;
    private int sem1int2marks2;
    private int sem1int3attendance2;
    private int sem1int3marks2;
    //sub3
    private String sem1subjectcode3;
    private String sem1subjectname3;
    private int sem1int1attendance3;
    private int sem1int1marks3;
    private int sem1int2attendace3;
    private int sem1int2marks3;
    private int sem1int3attendance3;
    private int sem1int3marks3;
    //sub4
    private String sem1subjectcode4;
    private String sem1subjectname4;
    private int sem1int1attendance4;
    private int sem1int1marks4;
    private int sem1int2attendace4;
    private int sem1int2marks4;
    private int sem1int3attendance4;
    private int sem1int3marks4;
    //sub5
    private String sem1subjectcode5;
    private String sem1subjectname5;
    private int sem1int1attendance5;
    private int sem1int1marks5;
    private int sem1int2attendace5;
    private int sem1int2marks5;
    private int sem1int3attendance5;
    private int sem1int3marks5;
    //sub6
    private String sem1subjectcode6;
    private String sem1subjectname6;
    private int sem1int1attendance6;
    private int sem1int1marks6;
    private int sem1int2attendace6;
    private int sem1int2marks6;
    private int sem1int3attendance6;
    private int sem1int3marks6;
    //sub7
    private String sem1subjectcode7;
    private String sem1subjectname7;
    private int sem1int1attendance7;
    private int sem1int1marks7;
    private int sem1int2attendace7;
    private int sem1int2marks7;
    private int sem1int3attendance7;
    private int sem1int3marks7;
    //sub8
    private String sem1subjectcode8;
    private String sem1subjectname8;
    private int sem1int1attendance8;
    private int sem1int1marks8;
    private int sem1int2attendace8;
    private int sem1int2marks8;
    private int sem1int3attendance8;
    private int sem1int3marks8;
    //sub9
    private String sem1subjectcode9;
    private String sem1subjectname9;
    private int sem1int1attendance9;
    private int sem1int1marks9;
    private int sem1int2attendace9;
    private int sem1int2marks9;
    private int sem1int3attendance9;
    private int sem1int3marks9;
    //sub10
    private String sem1subjectcode10;
    private String sem1subjectname10;
    private int sem1int1attendance10;
    private int sem1int1marks10;
    private int sem1int2attendace10;
    private int sem1int2marks10;
    private int sem1int3attendance10;
    private int sem1int3marks10;


    
}

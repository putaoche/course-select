package cn.wzvtcsoft.courseselect.repository;

import cn.wzvtcsoft.courseselect.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/*专业*/

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}

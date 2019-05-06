package cn.wzvtcsoft.courseselect.repository;

import cn.wzvtcsoft.courseselect.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/*专业*/
public interface TeacherRepository extends JpaRepository<TeacherEntity, Long> {

}

package cn.wzvtcsoft.courseselect.repository;

import cn.wzvtcsoft.courseselect.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/*专业*/

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {

}

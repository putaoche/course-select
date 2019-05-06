package cn.wzvtcsoft.courseselect.repository;

import cn.wzvtcsoft.courseselect.entity.CourseSelectionEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/*专业*/

public interface CourseSelectionRepository extends JpaRepository<CourseSelectionEntity, Long> {

}

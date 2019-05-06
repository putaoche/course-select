package cn.wzvtcsoft.courseselect.repository;

import cn.wzvtcsoft.courseselect.entity.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/*班级*/

public interface ClassRepository extends JpaRepository<ClassEntity, Long> {

}

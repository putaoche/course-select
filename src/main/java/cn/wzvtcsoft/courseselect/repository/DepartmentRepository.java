package cn.wzvtcsoft.courseselect.repository;

import cn.wzvtcsoft.courseselect.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/*系部*/

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {

}

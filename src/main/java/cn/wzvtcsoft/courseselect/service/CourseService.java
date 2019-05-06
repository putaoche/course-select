package cn.wzvtcsoft.courseselect.service;

import cn.wzvtcsoft.courseselect.entity.CourseEntity;

import java.util.List;

/*课程*/
public interface CourseService {
    /*查找所有信息*/
    List<CourseEntity> list();

    /*根据id查找*/
    CourseEntity getId(Long id);

    /*根据id删除*/
    boolean delete(CourseEntity courseEntity);

    /*修改*/
    boolean update(CourseEntity departmentEntity);

    /*增加*/
    boolean insert(CourseEntity departmentEntity);
}

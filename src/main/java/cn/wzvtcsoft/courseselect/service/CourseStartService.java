package cn.wzvtcsoft.courseselect.service;

import cn.wzvtcsoft.courseselect.entity.CourseStartEntity;

import java.util.List;

/*开课*/
public interface CourseStartService {
    /*查找所有信息*/
    List<CourseStartEntity> list();

    /*根据id查找*/
    CourseStartEntity getId(Long id);

    /*根据id删除*/
    boolean delete(CourseStartEntity courseStartEntity);

    /*修改*/
    boolean update(CourseStartEntity departmentEntity);

    /*增加*/
    boolean insert(CourseStartEntity departmentEntity);
}

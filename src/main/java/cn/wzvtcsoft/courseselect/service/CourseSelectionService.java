package cn.wzvtcsoft.courseselect.service;

import cn.wzvtcsoft.courseselect.entity.CourseSelectionEntity;

import java.util.List;

/*选课*/
public interface CourseSelectionService  {
    /*查找所有信息*/
    List<CourseSelectionEntity> list();

    /*根据id查找*/
    CourseSelectionEntity getId(Long id);

    /*根据id删除*/
    boolean delete(CourseSelectionEntity courseSelectionEntity);

    /*修改*/
    boolean update(CourseSelectionEntity departmentEntity);

    /*增加*/
    boolean insert(CourseSelectionEntity departmentEntity);
}

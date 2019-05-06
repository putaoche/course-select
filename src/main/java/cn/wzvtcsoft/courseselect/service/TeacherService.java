package cn.wzvtcsoft.courseselect.service;

import cn.wzvtcsoft.courseselect.entity.TeacherEntity;

import java.util.List;

/*教师*/
public interface TeacherService  {
    /*查找所有信息*/
    List<TeacherEntity> list();

    /*根据id查找*/
    TeacherEntity getId(Long id);

    /*根据id删除*/
    boolean delete(TeacherEntity departmentEntity);

    /*修改*/
    boolean update(TeacherEntity departmentEntity);

    /*增加*/
    boolean insert(TeacherEntity departmentEntity);
}

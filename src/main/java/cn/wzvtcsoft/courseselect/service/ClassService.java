package cn.wzvtcsoft.courseselect.service;


import cn.wzvtcsoft.courseselect.entity.ClassEntity;

import java.util.List;

/*班级*/
public interface ClassService {
    /*查找所有信息*/
    List<ClassEntity> list();

    /*根据id查找*/
    ClassEntity getId(Long id);

    /*删除*/
    boolean delete(ClassEntity classEntity);

    /*修改*/
    boolean update(ClassEntity classEntity);

    /*增加*/
    boolean insert(ClassEntity classEntity);
}

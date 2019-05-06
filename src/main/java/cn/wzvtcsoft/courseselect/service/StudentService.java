package cn.wzvtcsoft.courseselect.service;

import cn.wzvtcsoft.courseselect.entity.StudentEntity;

import java.util.List;

/*学生*/
public interface StudentService {
    /*查找所有信息*/
    List<StudentEntity> list();

    /*根据id查找*/
    StudentEntity getId(Long id);

    /*根据id删除*/
    boolean delete(StudentEntity departmentEntity);

    /*修改*/
    boolean update(StudentEntity departmentEntity);

    /*增加*/
    boolean insert(StudentEntity departmentEntity);
}

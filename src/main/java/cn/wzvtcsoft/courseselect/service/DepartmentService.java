package cn.wzvtcsoft.courseselect.service;

import cn.wzvtcsoft.courseselect.entity.DepartmentEntity;

import java.util.List;

/*系部*/
public interface DepartmentService {
    /*查找所有信息*/
    List<DepartmentEntity> list();

    /*根据id查找*/
    DepartmentEntity getId(Long id);

    /*根据id删除*/
    boolean delete(DepartmentEntity departmentEntity);

    /*修改*/
    boolean update(DepartmentEntity departmentEntity);

    /*增加*/
    boolean insert(DepartmentEntity departmentEntity);
}

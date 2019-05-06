package cn.wzvtcsoft.courseselect.service;

import cn.wzvtcsoft.courseselect.entity.MajorEntity;

import java.util.List;

/*专业*/
public interface MajorService  {
    /*查找所有信息*/
    List<MajorEntity> list();

    /*根据id查找*/
    MajorEntity getId(Long id);

    /*根据id删除*/
    boolean delete(MajorEntity departmentEntity);

    /*修改*/
    boolean update(MajorEntity departmentEntity);

    /*增加*/
    boolean insert(MajorEntity departmentEntity);
}

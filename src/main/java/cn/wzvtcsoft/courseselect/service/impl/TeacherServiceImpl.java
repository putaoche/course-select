package cn.wzvtcsoft.courseselect.service.impl;

import cn.wzvtcsoft.courseselect.entity.TeacherEntity;
import cn.wzvtcsoft.courseselect.repository.TeacherRepository;
import cn.wzvtcsoft.courseselect.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*教师*/
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    /*查找所有信息*/
    @Override
    public List<TeacherEntity> list() {
        return teacherRepository.findAll();
    }

    /*根据id查找*/
    @Override
    public TeacherEntity getId(Long id) {
        Optional<TeacherEntity> teacherEntity = teacherRepository.findById(id);
        return teacherEntity.orElse(null);
    }

    /*根据id删除*/
    @Override
    public boolean delete(TeacherEntity teacherEntity) {
        if(this.teacherRepository.existsById(teacherEntity.getId())) {
            this.teacherRepository.delete(teacherEntity);
            return true;
        }
        return false;
    }

    /*修改*/
    @Override
    public boolean update(TeacherEntity teacherEntity) {
        //是否为空，id是否存在
        if(this.teacherRepository.existsById(teacherEntity.getId())){
            this.teacherRepository.save(teacherEntity);
            return true;
        }
        return false;
    }

    /*保存*/
    @Override
    public boolean insert(TeacherEntity teacherEntity) {
        this.teacherRepository.saveAndFlush(teacherEntity);
        return true;
    }

}

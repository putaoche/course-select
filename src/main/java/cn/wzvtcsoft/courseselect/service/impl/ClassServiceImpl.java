package cn.wzvtcsoft.courseselect.service.impl;

import cn.wzvtcsoft.courseselect.entity.ClassEntity;
import cn.wzvtcsoft.courseselect.repository.ClassRepository;
import cn.wzvtcsoft.courseselect.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*班级*/
@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassRepository classRepository;
    /*查找所有信息*/
    @Override
    public List<ClassEntity> list() {
        return classRepository.findAll();
    }

    /*根据id查找*/
    @Override
    public ClassEntity getId(Long id) {
        Optional<ClassEntity> classEntity = classRepository.findById(id);
        return classEntity.orElse(null);
    }

    /*删除*/
    @Override
    public boolean delete(ClassEntity classEntity) {
        //id是否存在
        if(this.classRepository.existsById(classEntity.getId())) {
            this.classRepository.delete(classEntity);
            return true;
        }
        return false;
    }

    /*修改*/
    @Override
    public boolean update(ClassEntity classEntity) {
        //id是否存在
        if(this.classRepository.existsById(classEntity.getId())){
            this.classRepository.save(classEntity);
            return true;
        }
        return false;
    }

    /*保存*/
    @Override
    public boolean insert(ClassEntity classEntity) {
        this.classRepository.saveAndFlush(classEntity);
        return true;
    }
}

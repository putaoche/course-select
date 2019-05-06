package cn.wzvtcsoft.courseselect.service.impl;

import cn.wzvtcsoft.courseselect.entity.StudentEntity;
import cn.wzvtcsoft.courseselect.repository.StudentRepository;
import cn.wzvtcsoft.courseselect.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*学生*/
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    /*查找所有信息*/
    @Override
    public List<StudentEntity> list() {
        return studentRepository.findAll();
    }

    /*根据id查找*/
    @Override
    public StudentEntity getId(Long id) {
        Optional<StudentEntity> studentEntity = studentRepository.findById(id);
        return studentEntity.orElse(null);
    }

    /*根据id删除*/
    @Override
    public boolean delete(StudentEntity studentEntity) {
        if(this.studentRepository.existsById(studentEntity.getId())) {
            this.studentRepository.delete(studentEntity);
            return true;
        }
        return false;
    }

    /*修改*/
    @Override
    public boolean update(StudentEntity studentEntity) {
        //是否为空，id是否存在
        if(this.studentRepository.existsById(studentEntity.getId())){
            this.studentRepository.save(studentEntity);
            return true;
        }
        return false;
    }

    /*保存*/
    @Override
    public boolean insert(StudentEntity studentEntity) {
        this.studentRepository.saveAndFlush(studentEntity);
        return true;
    }

}

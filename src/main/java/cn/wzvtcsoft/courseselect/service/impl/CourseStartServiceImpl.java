package cn.wzvtcsoft.courseselect.service.impl;

import cn.wzvtcsoft.courseselect.entity.CourseStartEntity;
import cn.wzvtcsoft.courseselect.repository.CourseStartRepository;
import cn.wzvtcsoft.courseselect.service.CourseStartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*开课*/
@Service
public class CourseStartServiceImpl  implements CourseStartService {
    @Autowired
    private CourseStartRepository courseStartRepository;
    /*查找所有信息*/
    @Override
    public List<CourseStartEntity> list() {
        return courseStartRepository.findAll();
    }

    /*根据id查找*/
    @Override
    public CourseStartEntity getId(Long id) {
        Optional<CourseStartEntity> courseStartEntity = courseStartRepository.findById(id);
        return courseStartEntity.orElse(null);
    }

    /*删除*/
    @Override
    public boolean delete(CourseStartEntity courseStartEntity) {
        //id是否存在
        if(this.courseStartRepository.existsById(courseStartEntity.getId())) {
            this.courseStartRepository.delete(courseStartEntity);
            return true;
        }
        return false;
    }

    /*修改*/
    @Override
    public boolean update(CourseStartEntity courseStartEntity) {
        //id是否存在
        if(this.courseStartRepository.existsById(courseStartEntity.getId())){
            this.courseStartRepository.save(courseStartEntity);
            return true;
        }
        return false;
    }

    /*保存*/
    @Override
    public boolean insert(CourseStartEntity courseStartEntity) {
        this.courseStartRepository.saveAndFlush(courseStartEntity);
        return true;
    }

}

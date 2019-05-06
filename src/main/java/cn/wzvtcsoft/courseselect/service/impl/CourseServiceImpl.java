package cn.wzvtcsoft.courseselect.service.impl;

import cn.wzvtcsoft.courseselect.entity.CourseEntity;
import cn.wzvtcsoft.courseselect.repository.CourseRepository;
import cn.wzvtcsoft.courseselect.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*课程*/
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    /*查找所有信息*/
    @Override
    public List<CourseEntity> list() {
        return courseRepository.findAll();
    }

    /*根据id查找*/
    @Override
    public CourseEntity getId(Long id) {
        Optional<CourseEntity> courseEntity = courseRepository.findById(id);
        return courseEntity.orElse(null);
    }

    /*删除*/
    @Override
    public boolean delete(CourseEntity courseEntity) {
        //id是否存在
        if(this.courseRepository.existsById(courseEntity.getId())) {
            this.courseRepository.delete(courseEntity);
            return true;
        }
        return false;
    }

    /*修改*/
    @Override
    public boolean update(CourseEntity courseEntity) {
        //id是否存在
        if(this.courseRepository.existsById(courseEntity.getId())){
            this.courseRepository.save(courseEntity);
            return true;
        }
        return false;
    }

    /*保存*/
    @Override
    public boolean insert(CourseEntity courseEntity) {
        this.courseRepository.saveAndFlush(courseEntity);
        return true;
    }
}

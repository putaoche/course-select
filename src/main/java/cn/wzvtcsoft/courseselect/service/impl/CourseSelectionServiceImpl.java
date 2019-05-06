package cn.wzvtcsoft.courseselect.service.impl;

import cn.wzvtcsoft.courseselect.entity.CourseSelectionEntity;
import cn.wzvtcsoft.courseselect.repository.CourseSelectionRepository;
import cn.wzvtcsoft.courseselect.service.CourseSelectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*选课*/
@Service
public class CourseSelectionServiceImpl  implements CourseSelectionService {

    @Autowired
    private CourseSelectionRepository courseSelectionRepository;

    /*查找所有信息*/
    @Override
    public List<CourseSelectionEntity> list() {
        return courseSelectionRepository.findAll();
    }

    /*根据id查找*/
    @Override
    public CourseSelectionEntity getId(Long id) {
        Optional<CourseSelectionEntity> courseSelectionEntity = courseSelectionRepository.findById(id);
        return courseSelectionEntity.orElse(null);
    }

    /*删除*/
    @Override
    public boolean delete(CourseSelectionEntity courseSelectionEntity) {
        //id是否存在
        if(this.courseSelectionRepository.existsById(courseSelectionEntity.getId())) {
            this.courseSelectionRepository.delete(courseSelectionEntity);
            return true;
        }
        return false;
    }

    /*修改*/
    @Override
    public boolean update(CourseSelectionEntity courseSelectionEntity) {
        //id是否存在
        if(this.courseSelectionRepository.existsById(courseSelectionEntity.getId())){
            this.courseSelectionRepository.save(courseSelectionEntity);
            return true;
        }
        return false;
    }

    /*保存*/
    @Override
    public boolean insert(CourseSelectionEntity courseSelectionEntity) {
        this.courseSelectionRepository.saveAndFlush(courseSelectionEntity);
        return true;
    }
}

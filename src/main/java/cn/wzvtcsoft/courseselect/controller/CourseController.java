package cn.wzvtcsoft.courseselect.controller;

import cn.wzvtcsoft.common.validation.Add;
import cn.wzvtcsoft.common.validation.Update;
import cn.wzvtcsoft.courseselect.entity.CourseEntity;
import cn.wzvtcsoft.courseselect.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * 课程
 * */
@RestController
@RequestMapping("course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    /*得到全部信息*/
    @GetMapping
    public List<CourseEntity> list(){
        List<CourseEntity> list = courseService.list();

        return list;
    }

    /*根据id查找信息*/
    @GetMapping("{id}")
    public CourseEntity getId(@PathVariable Long id){
        CourseEntity data = courseService.getId(id);

        return data;
    }

    /*删除*/
    @DeleteMapping
    public boolean delete(@RequestBody @Validated(Update.class) CourseEntity courseEntity){
        return courseService.delete(courseEntity);
    }

    /*保存*/
    @PostMapping
    public boolean insert(@RequestBody @Validated(Add.class) CourseEntity courseEntity){
        return courseService.insert(courseEntity);
    }

    /*更新*/
    @PutMapping
    public boolean update(@RequestBody @Validated(Update.class) CourseEntity courseEntity){
        return courseService.update(courseEntity);
    }

}

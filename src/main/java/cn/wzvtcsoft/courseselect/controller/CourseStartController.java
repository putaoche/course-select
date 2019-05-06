package cn.wzvtcsoft.courseselect.controller;

import cn.wzvtcsoft.common.validation.Add;
import cn.wzvtcsoft.common.validation.Update;
import cn.wzvtcsoft.courseselect.entity.CourseStartEntity;
import cn.wzvtcsoft.courseselect.service.CourseStartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * 开课了
 * */
@RestController
@RequestMapping("coursestart")
public class CourseStartController {

    @Autowired
    private CourseStartService courseStartService;

    /*得到全部信息*/
    @GetMapping
    public List<CourseStartEntity> list(){
        List<CourseStartEntity> list = courseStartService.list();

        return list;
    }

    /*根据id查找信息*/
    @GetMapping("{id}")
    public CourseStartEntity getId(@PathVariable Long id){
        CourseStartEntity data = courseStartService.getId(id);

        return data;
    }

    /*删除*/
    @DeleteMapping
    public boolean delete(@RequestBody @Validated(Update.class) CourseStartEntity courseStartEntity){
        return courseStartService.delete(courseStartEntity);
    }

    /*保存*/
    @PostMapping
    public boolean insert(@RequestBody @Validated(Add.class) CourseStartEntity courseStartEntity){
        return courseStartService.insert(courseStartEntity);
    }

    /*更新*/
    @PutMapping
    public boolean update(@RequestBody @Validated(Update.class) CourseStartEntity courseStartEntity){
        return courseStartService.update(courseStartEntity);
    }

}

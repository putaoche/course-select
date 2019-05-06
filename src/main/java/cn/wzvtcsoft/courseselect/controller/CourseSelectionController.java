package cn.wzvtcsoft.courseselect.controller;

import cn.wzvtcsoft.common.validation.Add;
import cn.wzvtcsoft.common.validation.Update;
import cn.wzvtcsoft.courseselect.entity.CourseSelectionEntity;
import cn.wzvtcsoft.courseselect.service.CourseSelectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * 选课
 * */
@RestController
@RequestMapping("courseselection")
public class CourseSelectionController {

    @Autowired
    private CourseSelectionService courseSelectionService;

    /*得到全部信息*/
    @GetMapping
    public List<CourseSelectionEntity> list(){
        List<CourseSelectionEntity> list = courseSelectionService.list();

        return list;
    }

    /*根据id查找信息*/
    @GetMapping("{id}")
    public CourseSelectionEntity getId(@PathVariable Long id){
        CourseSelectionEntity data = courseSelectionService.getId(id);

        return data;
    }

    /*删除*/
    @DeleteMapping
    public boolean delete(@RequestBody @Validated(Update.class) CourseSelectionEntity courseSelectionEntity){
        return courseSelectionService.delete(courseSelectionEntity);
    }

    /*保存*/
    @PostMapping
    public boolean insert(@RequestBody @Validated(Add.class) CourseSelectionEntity courseSelectionEntity){
        return courseSelectionService.insert(courseSelectionEntity);
    }

    /*更新*/
    @PutMapping
    public boolean update(@RequestBody @Validated(Update.class) CourseSelectionEntity courseSelectionEntity){
        return courseSelectionService.update(courseSelectionEntity);
    }

}

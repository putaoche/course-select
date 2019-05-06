package cn.wzvtcsoft.courseselect.controller;

import cn.wzvtcsoft.common.validation.Add;
import cn.wzvtcsoft.common.validation.Update;
import cn.wzvtcsoft.courseselect.entity.TeacherEntity;
import cn.wzvtcsoft.courseselect.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * 教师
 * */
@RestController
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    /*得到全部信息*/
    @GetMapping
    public List<TeacherEntity> list(){
        List<TeacherEntity> list = teacherService.list();

        return list;
    }

    /*根据id查找信息*/
    @GetMapping("{id}")
    public TeacherEntity getId(@PathVariable Long id){
        TeacherEntity data = teacherService.getId(id);

        return data;
    }

    /*删除*/
    @DeleteMapping
    public boolean delete(@PathVariable @Validated(Update.class) TeacherEntity teacherEntity){
        return teacherService.delete(teacherEntity);
    }

    /*保存*/
    @PostMapping
    public boolean insert(@RequestBody  @Validated(Add.class) TeacherEntity teacherEntity){
        return teacherService.insert(teacherEntity);
    }

    /*更新*/
    @PutMapping
    public boolean update(@RequestBody @Validated(Update.class) TeacherEntity teacherEntity){
        return teacherService.update(teacherEntity);
    }

}

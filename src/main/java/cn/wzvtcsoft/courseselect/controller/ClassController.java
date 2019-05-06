package cn.wzvtcsoft.courseselect.controller;

import cn.wzvtcsoft.common.validation.Add;
import cn.wzvtcsoft.common.validation.Update;
import cn.wzvtcsoft.courseselect.entity.ClassEntity;
import cn.wzvtcsoft.courseselect.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
* 班级*/
@RestController
@RequestMapping("class")
public class ClassController {

    @Autowired
    private ClassService classService;

    /*得到全部信息*/
    @GetMapping
    public List<ClassEntity> list(){
        List<ClassEntity> list = classService.list();

        return list;
    }

    /*根据id查找信息*/
    @GetMapping("{id}")
    public ClassEntity getId(@PathVariable Long id){
        ClassEntity data = classService.getId(id);

        return data;
    }

    /*删除*/
    @DeleteMapping
    public boolean delete(@RequestBody @Validated(Update.class) ClassEntity classEntity){
        return classService.delete(classEntity);
    }

    /*保存*/
    @PostMapping
    public boolean insert(@RequestBody @Validated(Add.class) ClassEntity classEntity){
        return classService.insert(classEntity);
    }

    /*更新*/
    @PutMapping
    public boolean update(@RequestBody @Validated(Update.class) ClassEntity classEntity){
        return classService.update(classEntity);
    }

}

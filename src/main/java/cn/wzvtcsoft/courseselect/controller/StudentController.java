package cn.wzvtcsoft.courseselect.controller;

import cn.wzvtcsoft.common.validation.Add;
import cn.wzvtcsoft.common.validation.Update;
import cn.wzvtcsoft.courseselect.entity.StudentEntity;
import cn.wzvtcsoft.courseselect.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * 学生
 * */
@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /*得到全部信息*/
    @GetMapping
    public List<StudentEntity> list(){
        List<StudentEntity> list = studentService.list();

        return list;
    }

    /*根据id查找信息*/
    @GetMapping("{id}")
    public StudentEntity getId(@PathVariable Long id){
        StudentEntity data = studentService.getId(id);

        return data;
    }

    /*删除*/
    @DeleteMapping
    public boolean delete(@PathVariable @Validated(Update.class) StudentEntity studentEntity){
        return studentService.delete(studentEntity);
    }

    /*保存*/
    @PostMapping
    public boolean insert(@RequestBody @Validated(Add.class) StudentEntity studentEntity){
        return studentService.insert(studentEntity);
    }

    /*更新*/
    @PutMapping
    public boolean update(@RequestBody @Validated(Update.class) StudentEntity studentEntity){
        return studentService.update(studentEntity);
    }

}

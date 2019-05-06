package cn.wzvtcsoft.courseselect.controller;

import cn.wzvtcsoft.common.validation.Add;
import cn.wzvtcsoft.common.validation.Update;
import cn.wzvtcsoft.courseselect.entity.DepartmentEntity;
import cn.wzvtcsoft.courseselect.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*系部*/
@RestController
@RequestMapping("department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    /*得到全部信息*/
    @GetMapping
    public List<DepartmentEntity> list(){
        return departmentService.list();
    }

    /*根据id查找信息*/
    @GetMapping("{id}")
    public DepartmentEntity getId(@PathVariable Long id){
        return departmentService.getId(id);
    }

    /*删除*/
    @DeleteMapping
    public boolean delete(@PathVariable @Validated(Update.class) DepartmentEntity departmentEntity){
        return departmentService.delete(departmentEntity);
    }

    /*保存*/
    @PostMapping
    public boolean insert(@RequestBody @Validated(Add.class) DepartmentEntity departmentEntity){
        return departmentService.insert(departmentEntity);
    }

    /*更新*/
    @PutMapping
    public boolean update(@RequestBody @Validated(Update.class) DepartmentEntity departmentEntity){
        return departmentService.update(departmentEntity);
    }
}

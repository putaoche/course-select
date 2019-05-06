package cn.wzvtcsoft.courseselect.controller;

import cn.wzvtcsoft.common.validation.Add;
import cn.wzvtcsoft.common.validation.Update;
import cn.wzvtcsoft.courseselect.entity.MajorEntity;
import cn.wzvtcsoft.courseselect.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * 专业
 * */
@RestController
@RequestMapping("major")
public class MajorController {

    @Autowired
    private MajorService majorService;

    /*得到全部信息*/
    @GetMapping
    public List<MajorEntity> list(){
        List<MajorEntity> list = majorService.list();

        return list;
    }

    /*根据id查找信息*/
    @GetMapping("{id}")
    public MajorEntity getId(@PathVariable Long id){
        MajorEntity data = majorService.getId(id);

        return data;
    }

    /*删除*/
    @DeleteMapping
    public boolean delete(@PathVariable @Validated(Update.class) MajorEntity majorEntity){
        return majorService.delete(majorEntity);
    }

    /*保存*/
    @PostMapping
    public boolean insert(@RequestBody @Validated(Add.class) MajorEntity majorEntity){
        return majorService.insert(majorEntity);
    }

    /*更新*/
    @PutMapping
    public boolean update(@RequestBody @Validated(Update.class) MajorEntity majorEntity){
        return majorService.update(majorEntity);
    }

}

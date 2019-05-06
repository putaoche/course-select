package cn.wzvtcsoft.courseselect.service.impl;

import cn.wzvtcsoft.courseselect.entity.DepartmentEntity;
import cn.wzvtcsoft.courseselect.repository.DepartmentRepository;
import cn.wzvtcsoft.courseselect.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*系部*/
@Service
public class DepartmentServiceImpl  implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    /*查找所有信息*/
    @Override
    public List<DepartmentEntity> list() {
        return departmentRepository.findAll();
    }

    /*根据id查找*/
    @Override
    public DepartmentEntity getId(Long id) {
        Optional<DepartmentEntity> departmentEntity = departmentRepository.findById(id);
        return departmentEntity.orElse(null);
    }

    /*根据id删除*/
    @Override
    public boolean delete(DepartmentEntity departmentEntity) {
        //id是否存在
        if(this.departmentRepository.existsById(departmentEntity.getId())) {
            this.departmentRepository.delete(departmentEntity);
            return true;
        }
        return false;
    }

    /*修改*/
    @Override
    public boolean update(DepartmentEntity departmentEntity) {
        //id是否存在
        if(this.departmentRepository.existsById(departmentEntity.getId())){
            this.departmentRepository.save(departmentEntity);
            return true;
        }
        return false;
    }

    /*保存*/
    @Override
    public boolean insert(DepartmentEntity departmentEntity) {
        this.departmentRepository.saveAndFlush(departmentEntity);
        return true;
    }

}

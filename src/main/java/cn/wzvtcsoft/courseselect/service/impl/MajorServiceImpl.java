package cn.wzvtcsoft.courseselect.service.impl;

import cn.wzvtcsoft.courseselect.entity.MajorEntity;
import cn.wzvtcsoft.courseselect.repository.MajorRepository;
import cn.wzvtcsoft.courseselect.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*专业*/
@Service
public class MajorServiceImpl implements MajorService {
    @Autowired
    private MajorRepository majorRepository;
    /*查找所有信息*/
    @Override
    public List<MajorEntity> list() {
        return majorRepository.findAll();
    }

    /*根据id查找*/
    @Override
    public MajorEntity getId(Long id) {
        Optional<MajorEntity> majorEntity = majorRepository.findById(id);
        return majorEntity.orElse(null);
    }

    /*删除*/
    @Override
    public boolean delete(MajorEntity majorEntity) {
        if(this.majorRepository.existsById(majorEntity.getId())) {
            this.majorRepository.delete(majorEntity);
            return true;
        }
        return false;
    }

    /*修改*/
    @Override
    public boolean update(MajorEntity majorEntity) {
        //是否为空，id是否存在
        if(this.majorRepository.existsById(majorEntity.getId())){
            this.majorRepository.save(majorEntity);
            return true;
        }
        return false;
    }

    /*保存*/
    @Override
    public boolean insert(MajorEntity majorEntity) {
        this.majorRepository.saveAndFlush(majorEntity);
        return true;
    }

}

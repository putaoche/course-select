package cn.wzvtcsoft.courseselect.entity;

import cn.wzvtcsoft.base.entity.BaseEntity;
import cn.wzvtcsoft.common.validation.Add;
import cn.wzvtcsoft.common.validation.Update;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.io.Serializable;

/*
 * 班级
 * */
@Data
@EqualsAndHashCode(callSuper=true)
@Entity(name = "tb_class") // 不能用class作为表名，否则MySQL数据库会出错
public class ClassEntity extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //班级编号
    private String number;

    //班级名称
    private String name;

    //所属专业id
    private Long majorId;

    //所属系部id
    private Long departmentId;

    //教师id(班主任)
    private Long teacherId;
}

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
* 系部
* */
@Data
@EqualsAndHashCode(callSuper=true)
@Entity(name = "department")
public class DepartmentEntity extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //系部编号
    private Long number;

    //系部名称
    private String name;

}
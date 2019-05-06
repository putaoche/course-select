package cn.wzvtcsoft.courseselect.entity;

import cn.wzvtcsoft.common.validation.Add;
import cn.wzvtcsoft.common.validation.Update;
import lombok.Data;

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
@Entity(name = "department")
public class DepartmentEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //系部id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(groups = Update.class)
    @Null(groups = Add.class)
    private Long id;

    //系部编号
    private Long number;

    //系部名称
    private String name;

}
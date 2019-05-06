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
 * 专业
 * */
@Data
@Entity(name = "major")
public class MajorEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //专业id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(groups = Update.class)
    @Null(groups = Add.class)
    private Long id;

    //专业编号
    private Long number;

    //专业名称
    private String name;

    //所属系部id
    private Long departmentId;
}

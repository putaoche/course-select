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
 * 课程
 * */
@Data
@Entity(name = "course")
public class CourseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //课程id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(groups = Update.class)
    @Null(groups = Add.class)
    private Long id;

    //课程编号
    private String number;

    //课程名称
    private String name;

    //学时
    private Integer hour;

    //学分
    private Integer credit;

    //课程描述
    private String description;

    //所属专业id
    private Long majorId;

    //所属系部id
    private Long departmentId;
}

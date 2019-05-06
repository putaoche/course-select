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
 * 开课
 * */
@Data
@Entity(name = "course_start")
public class CourseStartEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //开课id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(groups = Update.class)
    @Null(groups = Add.class)
    private Long id;

    //课程id
    private Long CourseId;

    //开课教师id
    private Long teacherId;

    /*学年学期*/
    private Integer yearSemester;

    /*人数上限*/
    private Integer upperLimit;

    /*人数下限*/
    private Integer lowerLimit;


}

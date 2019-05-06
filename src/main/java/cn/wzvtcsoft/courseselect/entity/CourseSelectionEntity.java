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
 * 选课
 * */
@Data
@Entity(name = "course_select")
public class CourseSelectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //选课id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(groups = Update.class)
    @Null(groups = Add.class)
    private Long id;

    //学生id
    private Long studentId;

    //开课id
    private Long courseStartid;

    /*学年学期*/
    private Integer yearSemester;

    /*成绩*/
    private Integer upperLimit;



}

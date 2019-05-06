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
import java.util.Date;

/*
 * 学生
 * */
@Data
@Entity(name = "student")
public class StudentEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //学生id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(groups = Update.class)
    @Null(groups = Add.class)
    private Long id;

    //学生编号(学号)
    private String number;

    //学生名称
    private String name;

    //学生性别
    private boolean gender;

    //学生出生日期
    private Date birthDate;

    //学生入学日期
    private Date enterSchoolDate;

    //所属班级id
    private Long classId;

    //所属专业id
    private Long majorId;

    //所属系部id
    private Long departmentId;

    //学生密码
    private String password;
}

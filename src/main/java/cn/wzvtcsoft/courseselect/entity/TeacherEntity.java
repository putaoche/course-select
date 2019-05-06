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
 * 教师
 * */
@Data
@Entity(name = "teacher")
public class TeacherEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //教师id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(groups = Update.class)
    @Null(groups = Add.class)
    private Long id;

    //教师编号(教师工号)
    private Long number;

    //教师名称
    private String name;

    //教师性别()
    private boolean gender;

    //教师出生日期()
    private Date birthDate;

    //教师职业名称
    private String occupationName;

    //所属专业id
    private Long majorId;

    //所属系部id
    private Long departmentId;

    //密码
    private String password;
}

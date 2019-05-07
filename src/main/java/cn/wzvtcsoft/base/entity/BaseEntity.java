package cn.wzvtcsoft.base.entity;

import cn.wzvtcsoft.common.validation.Add;
import cn.wzvtcsoft.common.validation.Update;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * @author swxu_2005@163.com
 * @date 2019/5/7
 */
@Data
@MappedSuperclass
public class BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @NotNull(groups = Update.class)
  @Null(groups = Add.class)
  private Long id;

}

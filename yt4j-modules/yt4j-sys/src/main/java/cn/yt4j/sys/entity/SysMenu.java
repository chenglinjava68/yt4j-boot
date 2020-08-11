package cn.yt4j.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 资源权限(SysMenu)表实体类
 *
 * @author gyv12345@163.com
 * @since 2020-08-10 08:43:32
 */
@ApiModel(value = "SysMenu对象", description = "资源权限")
@Getter
@Setter
@ToString
public class SysMenu extends Model<SysMenu> {

	@ApiModelProperty(value = "id", example = "1")
	@TableId(value = "id", type = IdType.AUTO)
	private Long id;

	@ApiModelProperty(value = "类型 1系统 2菜单 3按钮", example = "1")
	private Integer type;

	@ApiModelProperty(value = "父级ID", example = "1")
	private Long parentId;

	@ApiModelProperty(value = "权限名称", example = "1")
	private String name;

	@ApiModelProperty(value = "权限标识", example = "1")
	private String code;

	@ApiModelProperty(value = "图标", example = "1")
	private String icon;

	@ApiModelProperty(value = "所有父级", example = "1")
	private String level;

	@ApiModelProperty(value = "排序", example = "1")
	private Integer order;

	@ApiModelProperty(value = "请求地址", example = "1")
	private String path;

	@ApiModelProperty(value = "组件地址", example = "1")
	private String component;

	@ApiModelProperty(value = "保持不变", example = "1")
	private Integer keepalive;

	@ApiModelProperty(value = "创建时间", example = "1")
	private LocalDateTime createTime;

	@ApiModelProperty(value = "修改时间", example = "1")
	private LocalDateTime updateTime;

	/**
	 * 获取主键值
	 * @return 主键值
	 */
	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
package xyz.saturnhalo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 客户信息表
 */
@TableName(value ="sys_user")
@Data
public class SysUser {
    /**
     * 主键ID (雪花算法)
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 小程序微信OpenID
     */
    @TableField(value = "wx_openid_mp")
    private String wx_openid_mp;

    /**
     * APP微信OpenID
     */
    @TableField(value = "wx_openid_app")
    private String wx_openid_app;

    /**
     * 微信UnionID (跨应用唯一标识)
     */
    @TableField(value = "wx_unionid")
    private String wx_unionid;

    /**
     * 微信昵称
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * APP登录用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * APP登录密码 (加密)
     */
    @TableField(value = "password")
    private String password;

    /**
     * 手机号 (账号打通关键)
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date create_time;

    /**
     * 创建人ID
     */
    @TableField(value = "create_user")
    private Long create_user;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date update_time;

    /**
     * 更新人ID
     */
    @TableField(value = "update_user")
    private Long update_user;

    /**
     * 逻辑删除 (0:正常 1:删除)
     */
    @TableField(value = "is_deleted")
    private Integer is_deleted;

    /**
     * 扩展字段1
     */
    @TableField(value = "ext1")
    private String ext1;

    /**
     * 扩展字段2
     */
    @TableField(value = "ext2")
    private String ext2;

    /**
     * 扩展字段3
     */
    @TableField(value = "ext3")
    private String ext3;

    /**
     * 扩展字段4
     */
    @TableField(value = "ext4")
    private String ext4;

    /**
     * 扩展字段5
     */
    @TableField(value = "ext5")
    private String ext5;

    /**
     * 扩展字段6
     */
    @TableField(value = "ext6")
    private String ext6;

    /**
     * 扩展字段7
     */
    @TableField(value = "ext7")
    private String ext7;

    /**
     * 扩展字段8
     */
    @TableField(value = "ext8")
    private String ext8;

    /**
     * 扩展字段9
     */
    @TableField(value = "ext9")
    private String ext9;

    /**
     * 扩展字段10
     */
    @TableField(value = "ext10")
    private String ext10;
}
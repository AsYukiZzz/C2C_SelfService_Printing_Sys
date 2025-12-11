package xyz.saturnhalo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 商家信息表
 */
@TableName(value ="sys_merchant")
@Data
public class SysMerchant {
    /**
     * 主键ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 登录账号
     */
    @TableField(value = "username")
    private String username;

    /**
     * 权限等级
     */
    @TableField(value = "permission")
    private Integer permission;

    /**
     * 加密密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 店铺名称
     */
    @TableField(value = "shop_name")
    private String shop_name;

    /**
     * 联系电话
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 详细地址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 经度 (LBS)
     */
    @TableField(value = "longitude")
    private BigDecimal longitude;

    /**
     * 纬度 (LBS)
     */
    @TableField(value = "latitude")
    private BigDecimal latitude;

    /**
     * 账户余额
     */
    @TableField(value = "balance")
    private BigDecimal balance;

    /**
     * 营业状态 (0:休息 1:营业)
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 审核状态 (0:待审 1:通过)
     */
    @TableField(value = "is_audit")
    private Integer is_audit;

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
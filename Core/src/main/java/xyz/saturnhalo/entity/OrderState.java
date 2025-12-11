package xyz.saturnhalo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 订单状态表
 */
@TableName(value ="order_state")
@Data
public class OrderState {
    /**
     * 主键ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 关联订单ID
     */
    @TableField(value = "order_id")
    private Long order_id;

    /**
     * 变更后的状态
     */
    @TableField(value = "order_status")
    private Integer order_status;

    /**
     * 操作人 (system/user/merchant)
     */
    @TableField(value = "operator")
    private String operator;

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
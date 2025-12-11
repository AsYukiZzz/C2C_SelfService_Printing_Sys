package xyz.saturnhalo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 订单信息表
 */
@TableName(value ="order_info")
@Data
public class OrderInfo {
    /**
     * 主键ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 业务订单号
     */
    @TableField(value = "order_no")
    private String order_no;

    /**
     * 下单用户ID
     */
    @TableField(value = "user_id")
    private Long user_id;

    /**
     * 接单商户ID
     */
    @TableField(value = "merchant_id")
    private Long merchant_id;

    /**
     * 指定打印机ID
     */
    @TableField(value = "printer_id")
    private Long printer_id;

    /**
     * 订单总金额
     */
    @TableField(value = "total_amount")
    private BigDecimal total_amount;

    /**
     * 用户备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 取件码
     */
    @TableField(value = "pick_code")
    private String pick_code;

    /**
     * 状态 (0:待付 1:待打 2:完成)
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 支付时间
     */
    @TableField(value = "pay_time")
    private Date pay_time;

    /**
     * 完成时间
     */
    @TableField(value = "finish_time")
    private Date finish_time;

    /**
     * 乐观锁版本号
     */
    @TableField(value = "version")
    private Integer version;

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
package xyz.saturnhalo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 打印机信息表
 */
@TableName(value ="printer_info")
@Data
public class PrinterInfo {
    /**
     * 主键ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 归属商家ID
     */
    @TableField(value = "merchant_id")
    private Long merchant_id;

    /**
     * 打印机名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 打印机型号
     */
    @TableField(value = "model")
    private String model;

    /**
     * 设备状态 (0:离线 1:在线 2:故障)
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 是否支持彩印 (0:不支持 1:支持)
     */
    @TableField(value = "can_color")
    private Integer can_color;

    /**
     * 是否支持自动双面 (0:不支持 1:支持)
     */
    @TableField(value = "can_duplex")
    private Integer can_duplex;

    /**
     * 黑白单面价格 (元/张)
     */
    @TableField(value = "price_single_bw")
    private BigDecimal price_single_bw;

    /**
     * 黑白双面价格 (元/张)
     */
    @TableField(value = "price_double_bw")
    private BigDecimal price_double_bw;

    /**
     * 彩色单面价格 (元/张)
     */
    @TableField(value = "price_single_co")
    private BigDecimal price_single_co;

    /**
     * 彩色双面价格 (元/张)
     */
    @TableField(value = "price_double_co")
    private BigDecimal price_double_co;

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
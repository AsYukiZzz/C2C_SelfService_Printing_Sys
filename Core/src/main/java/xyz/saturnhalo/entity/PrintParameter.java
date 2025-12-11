package xyz.saturnhalo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 打印具体参数表
 */
@TableName(value ="print_parameter")
@Data
public class PrintParameter {
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
     * 打印份数
     */
    @TableField(value = "print_copies")
    private Integer print_copies;

    /**
     * 色彩 (0:黑白 1:彩色)
     */
    @TableField(value = "print_color")
    private Integer print_color;

    /**
     * 单双 (0:单面 1:双面)
     */
    @TableField(value = "print_duplex")
    private Integer print_duplex;

    /**
     * 纸张规格
     */
    @TableField(value = "print_size")
    private String print_size;

    /**
     * 缩印 (0:无 1:二合一)
     */
    @TableField(value = "print_reduce")
    private Integer print_reduce;

    /**
     * 原始文件名
     */
    @TableField(value = "origin_name")
    private String origin_name;

    /**
     * 原始格式
     */
    @TableField(value = "origin_format")
    private String origin_format;

    /**
     * 原始文件路径(OSS)
     */
    @TableField(value = "oss_key")
    private String oss_key;

    /**
     * 转码后PDF路径(OSS)
     */
    @TableField(value = "pdf_oss_key")
    private String pdf_oss_key;

    /**
     * 文件大小 (字节)
     */
    @TableField(value = "file_size")
    private Long file_size;

    /**
     * 计费页数
     */
    @TableField(value = "page_count")
    private Integer page_count;

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
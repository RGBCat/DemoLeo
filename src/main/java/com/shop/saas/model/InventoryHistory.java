package com.shop.saas.model;

    import com.baomidou.mybatisplus.annotation.TableName;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import java.util.Date;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.io.Serializable;
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 
    * </p>
*
* @author hanlq
* @since 2020-12-10
*/
    @Data
    @Accessors(chain = true)
    @TableName("t_inventory_history")
    @ApiModel(value="InventoryHistory对象", description="")
    public class InventoryHistory extends Model<InventoryHistory> {

    private static final long serialVersionUID = 1L;

            @ApiModelProperty(value = "自增主键")
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            @ApiModelProperty(value = "批次号")
    private String batchNo;

            @ApiModelProperty(value = "仓库id")
    private Integer wrhId;

            @ApiModelProperty(value = "供应商")
    private Integer supplierId;

            @ApiModelProperty(value = "子产品id")
    private Integer productSubId;

            @ApiModelProperty(value = "租户id")
    private Integer tenantId;

            @ApiModelProperty(value = "操作类型（移库、增库）")
    private String operateType;

            @ApiModelProperty(value = "来源id")
    private Integer sourceId;

            @ApiModelProperty(value = "操作库存数量（正负）")
    private Integer number;

            @ApiModelProperty(value = "入库成本价")
    private Long costPrice;

            @ApiModelProperty(value = "当前批次支付时间")
    private Date payTime;

            @ApiModelProperty(value = "创建人ID")
    private Integer createUser;

            @ApiModelProperty(value = "更新人ID")
    private Integer updateUser;

            @ApiModelProperty(value = "创建时间")
    private Date createTime;

            @ApiModelProperty(value = "更新时间")
    private Date updateTime;

            @ApiModelProperty(value = "是否删除 0:删除 1:正常")
    private Integer deleteStatus;

            @ApiModelProperty(value = "描述")
    private String description;

            @ApiModelProperty(value = "库存id")
    private Integer inventId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

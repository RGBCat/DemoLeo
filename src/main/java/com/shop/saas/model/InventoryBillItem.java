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
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("t_inventory_bill_item")
    @ApiModel(value="InventoryBillItem对象", description="")
    public class InventoryBillItem extends Model<InventoryBillItem> {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            @ApiModelProperty(value = "package主键")
    private Integer inventoryBillPackageId;

            @ApiModelProperty(value = "库存id")
    private Integer inventId;

            @ApiModelProperty(value = "仓库id")
    private Integer wrhId;

            @ApiModelProperty(value = "供应商id")
    private Integer supplierId;

            @ApiModelProperty(value = "子商品id")
    private Integer productSubId;

            @ApiModelProperty(value = "租户id")
    private Integer tenantId;

            @ApiModelProperty(value = "操作类型")
    private String operateType;

            @ApiModelProperty(value = "库存数量")
    private Integer number;

            @ApiModelProperty(value = "成本")
    private Long costPrice;

    private Integer createUser;

    private Date createTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

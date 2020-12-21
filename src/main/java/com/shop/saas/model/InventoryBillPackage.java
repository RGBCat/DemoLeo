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
* @since 2020-12-03
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("t_inventory_bill_package")
    @ApiModel(value="InventoryBillPackage对象", description="")
    public class InventoryBillPackage extends Model<InventoryBillPackage> {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            @ApiModelProperty(value = "订单id")
    private Integer orderId;

            @ApiModelProperty(value = "租户id")
    private Integer tenantId;

            @ApiModelProperty(value = "创建人")
    private Integer createUser;

            @ApiModelProperty(value = "创建时间")
    private Date createTime;

            @ApiModelProperty(value = "来源类型")
    private String sourceType;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

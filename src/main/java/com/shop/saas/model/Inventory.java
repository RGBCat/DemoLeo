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
* @since 2020-12-01
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("t_inventory")
    @ApiModel(value="Inventory对象", description="")
    public class Inventory extends Model<Inventory> {

    private static final long serialVersionUID = 1L;

            @ApiModelProperty(value = "自增主键")
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            @ApiModelProperty(value = "库存编码")
    private String code;

            @ApiModelProperty(value = "仓库id")
    private Integer wrhId;

            @ApiModelProperty(value = "产品详情id")
    private Integer productDetailId;

            @ApiModelProperty(value = "产品id")
    private Integer productId;

            @ApiModelProperty(value = "子产品id")
    private Integer productSubId;

            @ApiModelProperty(value = "租户id")
    private Integer tenantId;

            @ApiModelProperty(value = "库存数量")
    private Integer stockNumber;

            @ApiModelProperty(value = "入库数量")
    private Integer inStockNumber;

            @ApiModelProperty(value = "出库数量")
    private Integer outStockNumber;

            @ApiModelProperty(value = "占用库存数量")
    private Integer occupyStockNumber;

            @ApiModelProperty(value = "可用库存数量")
    private Integer useableStockNumber;

            @ApiModelProperty(value = "超卖数量")
    private Integer oversaleStockNumber;

            @ApiModelProperty(value = "创建人ID")
    private Integer createUser;

            @ApiModelProperty(value = "更新人ID")
    private Integer updateUser;

            @ApiModelProperty(value = "最后一次入库时间")
    private Date lastInTime;

            @ApiModelProperty(value = "创建时间")
    private Date createTime;

            @ApiModelProperty(value = "更新时间")
    private Date updateTime;

            @ApiModelProperty(value = "是否删除 0:删除 1:正常")
    private Integer deleteStatus;

            @ApiModelProperty(value = "版本号")
    private Integer baseVersion;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

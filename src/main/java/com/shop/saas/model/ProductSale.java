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
    * 商品销售信息表
    * </p>
*
* @author hanlq
* @since 2020-12-01
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("t_product_sale")
    @ApiModel(value="ProductSale对象", description="商品销售信息表")
    public class ProductSale extends Model<ProductSale> {

    private static final long serialVersionUID = 1L;

            @ApiModelProperty(value = "商品销售id")
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            @ApiModelProperty(value = "主商品id")
    private Integer productId;

            @ApiModelProperty(value = "商品数量")
    private Integer number;

            @ApiModelProperty(value = "商品价格")
    private Long price;

            @ApiModelProperty(value = "创建人id")
    private Integer createUser;

            @ApiModelProperty(value = "更新人id")
    private Integer updateUser;

            @ApiModelProperty(value = "创建时间")
    private Date createTime;

            @ApiModelProperty(value = "更新时间")
    private Date updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

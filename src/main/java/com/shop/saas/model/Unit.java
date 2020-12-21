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
    * 单位信息表
    * </p>
*
* @author hanlq
* @since 2020-12-01
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("t_unit")
    @ApiModel(value="Unit对象", description="单位信息表")
    public class Unit extends Model<Unit> {

    private static final long serialVersionUID = 1L;

            @ApiModelProperty(value = "单位id")
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            @ApiModelProperty(value = "单位编码")
    private String code;

            @ApiModelProperty(value = "单位名称")
    private String name;

            @ApiModelProperty(value = "数量")
    private Integer number;

            @ApiModelProperty(value = "租户id")
    private Integer tenantId;

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

package pers.laineyc.blackdream.generator.action.web.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pers.laineyc.blackdream.framework.controller.request.Request;

/**
 * 生成器数据模型模式单个查询Request
 * @author LaineyC
 */
@ApiModel
public class DataModelSchemaGetWebRequest extends Request {

    @ApiModelProperty(value = "主键", required = true)
    private Long id;

    public DataModelSchemaGetWebRequest() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
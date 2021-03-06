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
    private String id;

    @ApiModelProperty(value = "所属生成器")
    private String generatorId;

    public DataModelSchemaGetWebRequest() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGeneratorId() {
        return generatorId;
    }

    public void setGeneratorId(String generatorId) {
        this.generatorId = generatorId;
    }
}
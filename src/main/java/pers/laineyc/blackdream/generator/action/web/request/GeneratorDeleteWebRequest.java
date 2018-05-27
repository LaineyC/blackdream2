package pers.laineyc.blackdream.generator.action.web.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pers.laineyc.blackdream.framework.controller.request.Request;

/**
 * 生成器删除Request
 * @author LaineyC
 */
@ApiModel
public class GeneratorDeleteWebRequest extends Request {

    @ApiModelProperty(value = "主键", required = true)
    private Long id;

    public GeneratorDeleteWebRequest() {

    }
    
    public Long getId() {
        return this.id;
    }

    public void setId (Long id) {
        this.id = id;
    }
    
}
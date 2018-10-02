package pers.laineyc.blackdream.generator.service.parameter;

import io.swagger.annotations.ApiModelProperty;
import pers.laineyc.blackdream.framework.service.parameter.Parameter;

import java.util.ArrayList;
import java.util.List;

/**
 * 生成器生成策略删除Parameter
 * @author LaineyC
 */
public class CreationStrategyDeleteParameter extends Parameter {

    /**
     * 主键
     */
    private String id;

    /**
     * 主键集合
     */
    private List<String> idList = new ArrayList<>();

    public CreationStrategyDeleteParameter() {

    }
    
    public String getId() {
        return this.id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public List<String> getIdList() {
        return idList;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }
}
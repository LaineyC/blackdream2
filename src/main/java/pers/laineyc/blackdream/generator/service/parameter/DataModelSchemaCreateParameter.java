package pers.laineyc.blackdream.generator.service.parameter;

import pers.laineyc.blackdream.framework.service.parameter.Parameter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 生成器数据模型模式创建Parameter
 * @author LaineyC
 */
public class DataModelSchemaCreateParameter extends Parameter {

    /**
     * 所属生成器
     */
    private String generatorId;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 规则集合
     */
    private Map<String, List<String>> ruleMap = new HashMap<>();

    public DataModelSchemaCreateParameter() {

    }

    public String getGeneratorId() {
        return this.generatorId;
    }

    public void setGeneratorId(String generatorId) {
        this.generatorId = generatorId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, List<String>> getRuleMap() {
        return ruleMap;
    }

    public void setRuleMap(Map<String, List<String>> ruleMap) {
        this.ruleMap = ruleMap;
    }
}
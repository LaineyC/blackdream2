package pers.laineyc.blackdream.generator.service.parameter;

import pers.laineyc.blackdream.framework.service.parameter.Parameter;

/**
 * 生成器生成策略多个查询Parameter
 * @author LaineyC
 */
public class CreationStrategyInfoQueryParameter extends Parameter {

    /**
     * 所属生成器
     */
    private String generatorId;

    /**
     * 名称
     */
    private String name;

    /**
     * 脚本语言：1javascript
     */
    private Integer scriptLanguage;

    public CreationStrategyInfoQueryParameter() {

    }

    public String getGeneratorId() {
        return generatorId;
    }

    public void setGeneratorId(String generatorId) {
        this.generatorId = generatorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScriptLanguage() {
        return scriptLanguage;
    }

    public void setScriptLanguage(Integer scriptLanguage) {
        this.scriptLanguage = scriptLanguage;
    }
}
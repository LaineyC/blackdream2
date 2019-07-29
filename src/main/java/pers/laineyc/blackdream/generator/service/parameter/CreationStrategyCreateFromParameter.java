package pers.laineyc.blackdream.generator.service.parameter;

import pers.laineyc.blackdream.framework.service.parameter.Parameter;

/**
 * 生成器生成策略单个查询Parameter
 * @author LaineyC
 */
public class CreationStrategyCreateFromParameter extends Parameter {

    /**
     * 生成器
     */
    private String generatorId;

    /**
     * 生成器
     */
    private String fromGeneratorId;

    public String getGeneratorId() {
        return generatorId;
    }

    public void setGeneratorId(String generatorId) {
        this.generatorId = generatorId;
    }

    public String getFromGeneratorId() {
        return fromGeneratorId;
    }

    public void setFromGeneratorId(String fromGeneratorId) {
        this.fromGeneratorId = fromGeneratorId;
    }

}
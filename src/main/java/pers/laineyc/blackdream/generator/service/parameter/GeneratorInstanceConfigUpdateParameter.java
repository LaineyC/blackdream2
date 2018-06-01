package pers.laineyc.blackdream.generator.service.parameter;

import pers.laineyc.blackdream.framework.service.parameter.Parameter;
import pers.laineyc.blackdream.generator.service.domain.DataModelFieldConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 生成器实例设置修改Parameter
 * @author LaineyC
 */
public class GeneratorInstanceConfigUpdateParameter extends Parameter {

    /**
     * 主键
     */
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 属性列表
     */
    private List<DataModelFieldConfig> propertyList = new ArrayList<>();

    /**
     * 字段列表
     */
    private List<DataModelFieldConfig> fieldList = new ArrayList<>();

    /**
     * 是否直接添加默认记录
     */
    private Boolean isAddDefaultRecordList;

    /**
     * 默认记录集合数据
     */
    private List<Map<String, Object>> defaultRecordList = new ArrayList<>();

    public GeneratorInstanceConfigUpdateParameter() {

    }
    
    public String getId() {
        return this.id;
    }

    public void setId (String id) {
        this.id = id;
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

    public List<DataModelFieldConfig> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<DataModelFieldConfig> propertyList) {
        this.propertyList = propertyList;
    }

    public List<DataModelFieldConfig> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<DataModelFieldConfig> fieldList) {
        this.fieldList = fieldList;
    }

    public Boolean getIsAddDefaultRecordList() {
        return isAddDefaultRecordList;
    }

    public void setIsAddDefaultRecordList(Boolean isAddDefaultRecordList) {
        this.isAddDefaultRecordList = isAddDefaultRecordList;
    }

    public List<Map<String, Object>> getDefaultRecordList() {
        return defaultRecordList;
    }

    public void setDefaultRecordList(List<Map<String, Object>> defaultRecordList) {
        this.defaultRecordList = defaultRecordList;
    }
}
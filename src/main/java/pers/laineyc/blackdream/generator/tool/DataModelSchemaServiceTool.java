package pers.laineyc.blackdream.generator.tool;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import pers.laineyc.blackdream.configuration.constant.SystemConstant;
import pers.laineyc.blackdream.framework.exception.BusinessException;
import pers.laineyc.blackdream.generator.service.parameter.*;
import pers.laineyc.blackdream.generator.service.domain.DataModelSchema;
import pers.laineyc.blackdream.generator.dao.po.DataModelSchemaPo;
import pers.laineyc.blackdream.generator.dao.query.DataModelSchemaQuery;
import pers.laineyc.blackdream.generator.dao.DataModelSchemaDao;
import pers.laineyc.blackdream.usercenter.dao.po.UserPo;
import pers.laineyc.blackdream.usercenter.dao.query.UserQuery;
import pers.laineyc.blackdream.usercenter.dao.UserDao;
import pers.laineyc.blackdream.generator.dao.po.GeneratorPo;
import pers.laineyc.blackdream.generator.dao.query.GeneratorQuery;
import pers.laineyc.blackdream.generator.dao.GeneratorDao;

import java.io.File;
import java.util.Date;

/**
 * 生成器数据模型模式ServiceTool
 * @author LaineyC
 */
@Component
public class DataModelSchemaServiceTool{

    @Autowired
    private DataModelSchemaDao dataModelSchemaDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private GeneratorDao generatorDao;

    @Autowired
    private GeneratorServiceTool generatorServiceTool;

    public DataModelSchemaServiceTool() {

	}

    public String getScriptPath(String generatorId, String id){
        return generatorServiceTool.getGeneratorPath(generatorId) + File.separator + SystemConstant.DATA_MODEL_SCHEMA_PATH_NAME + File.separator + id + ".data";
    }

    /**
     * 生成器数据模型模式创建Validate
     */
    public void createValidate(DataModelSchemaCreateParameter parameter) {
        String generatorId = parameter.getGeneratorId();
        if(generatorId == null){
            throw new BusinessException("缺少所属生成器参数");
        }
        GeneratorPo generatorPo = generatorDao.selectById(generatorId);
        if(generatorPo == null || generatorPo.getIsDeleted()){
            throw new BusinessException("所属生成器不存在");
        }

        String name = parameter.getName();
        if(StringUtils.hasText(name)){
            if(name.length() > 255){
                throw new BusinessException("名称长度不能大于255");
            }
        }

        String description = parameter.getDescription();
        if(StringUtils.hasText(description)){
            if(description.length() > 255){
                throw new BusinessException("描述长度不能大于255");
            }
        }
    }

    /**
     * 生成器数据模型模式删除Validate
     */
    public void deleteValidate(DataModelSchemaDeleteParameter parameter) {
        String id = parameter.getId();
        if(id == null){
            throw new BusinessException("缺少主键");
        }
    }
    
    /**
     * 生成器数据模型模式修改Validate
     */
    public void updateValidate(DataModelSchemaUpdateParameter parameter) {
        String id = parameter.getId();
        if(id == null){
            throw new BusinessException("缺少主键");
        }

        String name = parameter.getName();
        if(StringUtils.hasText(name)){
            if(name.length() > 255){
                throw new BusinessException("名称长度不能大于255");
            }
        }

        String description = parameter.getDescription();
        if(StringUtils.hasText(description)){
            if(description.length() > 255){
                throw new BusinessException("描述长度不能大于255");
            }
        }
    }
    
    /**
     * 生成器数据模型模式单个查询Validate
     */
    public void getValidate(DataModelSchemaGetParameter parameter) {
        String id = parameter.getId();
        String generatorId = parameter.getGeneratorId();
        if(id == null && generatorId == null) {
            throw new BusinessException("缺少参数");
        }
    }

    /**
     * 生成器数据模型模式多个查询Validate
     */
    public void queryValidate(DataModelSchemaQueryParameter parameter) {

    }

    /**
     * 生成器数据模型模式分页查询Validate
     */
    public void searchValidate(DataModelSchemaSearchParameter parameter) {
        Integer page = parameter.getPage();
        if(page == null || page < 1){
            throw new BusinessException("页数不合法");
        }

        Integer pageSize = parameter.getPageSize();
        if(pageSize == null || pageSize < 1 || pageSize > 100){
            throw new BusinessException("每页数量不合法");
        }
    }

    /**
     * 生成器数据模型模式修改Validate
     */
    public void saveValidate(DataModelSchemaSaveParameter parameter) {
        String generatorId = parameter.getGeneratorId();
        if(generatorId == null) {
            throw new BusinessException("缺少所属生成器");
        }

        String name = parameter.getName();
        if(StringUtils.hasText(name)){
            if(name.length() > 255){
                throw new BusinessException("名称长度不能大于255");
            }
        }

        String description = parameter.getDescription();
        if(StringUtils.hasText(description)){
            if(description.length() > 255){
                throw new BusinessException("描述长度不能大于255");
            }
        }
    }

}
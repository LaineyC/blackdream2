package pers.laineyc.blackdream.generator.action.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.laineyc.blackdream.configuration.config.AuthSecurity;
import pers.laineyc.blackdream.framework.controller.response.Response;
import pers.laineyc.blackdream.framework.util.BeanUtils;
import pers.laineyc.blackdream.framework.controller.BaseWebController;
import pers.laineyc.blackdream.generator.action.web.request.*;
import pers.laineyc.blackdream.generator.action.web.vo.*;
import pers.laineyc.blackdream.generator.service.parameter.*;
import pers.laineyc.blackdream.generator.service.domain.GeneratorGuide;
import pers.laineyc.blackdream.generator.service.GeneratorGuideService;

/**
 * 生成器指南Controller
 * @author LaineyC
 */
@Api(tags = "GeneratorGuide", description = "生成器指南接口")
@Controller
public class GeneratorGuideWebController extends BaseWebController {

    @Autowired
    private GeneratorGuideService generatorGuideService;
    
    public GeneratorGuideWebController() {

    }
/*
    @Security
    @ApiOperation(value = "生成器指南创建")
    @PostMapping(value = "/generatorGuide/create")
    public @ResponseBody Response<GeneratorGuideCreateWebVo> create(@RequestBody GeneratorGuideCreateWebRequest request) {
        GeneratorGuideCreateParameter parameter = new GeneratorGuideCreateParameter();
        BeanUtils.copyProperties(request, parameter);

        GeneratorGuide generatorGuide = generatorGuideService.create(parameter);

        GeneratorGuideCreateWebVo generatorGuideCreateWebVo = new GeneratorGuideCreateWebVo();
        BeanUtils.copyProperties(generatorGuide, generatorGuideCreateWebVo);

        return new Response<>(generatorGuideCreateWebVo);
    }

    @Security
    @ApiOperation(value = "生成器指南删除")
    @PostMapping(value = "/generatorGuide/delete")
    public @ResponseBody Response<GeneratorGuideDeleteWebVo> delete(@RequestBody GeneratorGuideDeleteWebRequest request) {
        GeneratorGuideDeleteParameter parameter = new GeneratorGuideDeleteParameter();
        BeanUtils.copyProperties(request, parameter);

        GeneratorGuide generatorGuide = generatorGuideService.delete(parameter);

        GeneratorGuideDeleteWebVo generatorGuideDeleteWebVo = new GeneratorGuideDeleteWebVo();
        BeanUtils.copyProperties(generatorGuide, generatorGuideDeleteWebVo);

        return new Response<>(generatorGuideDeleteWebVo);
    }

    @Security
    @ApiOperation(value = "生成器指南修改")
    @PostMapping(value = "/generatorGuide/update")
    public @ResponseBody Response<GeneratorGuideUpdateWebVo> update(@RequestBody GeneratorGuideUpdateWebRequest request) {
        GeneratorGuideUpdateParameter parameter = new GeneratorGuideUpdateParameter();
        BeanUtils.copyProperties(request, parameter);

        GeneratorGuide generatorGuide = generatorGuideService.update(parameter);

        GeneratorGuideUpdateWebVo generatorGuideUpdateWebVo = new GeneratorGuideUpdateWebVo();
        BeanUtils.copyProperties(generatorGuide, generatorGuideUpdateWebVo);

        return new Response<>(generatorGuideUpdateWebVo);
    }
*/
    @ApiOperation(value = "生成器指南单个查询")
    @PostMapping(value = "/generatorGuide/get")
    public @ResponseBody Response<GeneratorGuideGetWebVo> get(@RequestBody GeneratorGuideGetWebRequest request) {
        GeneratorGuideGetParameter parameter = new GeneratorGuideGetParameter();
        BeanUtils.copyProperties(request, parameter);

        GeneratorGuide generatorGuide = generatorGuideService.get(parameter);

        GeneratorGuideGetWebVo generatorGuideGetWebVo = null;
        if(generatorGuide != null){
            generatorGuideGetWebVo = new GeneratorGuideGetWebVo();
            BeanUtils.copyProperties(generatorGuide, generatorGuideGetWebVo);
        }

        return new Response<>(generatorGuideGetWebVo);
    }
/*
    @ApiOperation(value="生成器指南多个查询")
    @PostMapping(value = "/generatorGuide/query")
    public @ResponseBody Response<List<GeneratorGuideQueryWebVo>> query(@RequestBody GeneratorGuideQueryWebRequest request) {
        GeneratorGuideQueryParameter parameter = new GeneratorGuideQueryParameter();
        BeanUtils.copyProperties(request, parameter);
        
        List<GeneratorGuide> generatorGuideList = generatorGuideService.query(parameter);
        
        List<GeneratorGuideQueryWebVo> generatorGuideQueryWebVoList = new ArrayList<>();
        generatorGuideList.forEach(generatorGuide -> {
            GeneratorGuideQueryWebVo generatorGuideQueryWebVo = new GeneratorGuideQueryWebVo();
            BeanUtils.copyProperties(generatorGuide, generatorGuideQueryWebVo);
            generatorGuideQueryWebVoList.add(generatorGuideQueryWebVo);
        });

        return new Response<>(generatorGuideQueryWebVoList);
    }

    @ApiOperation(value = "生成器指南分页查询")
    @PostMapping(value = "/generatorGuide/search")
    public @ResponseBody Response<PageResult<GeneratorGuideSearchWebVo>> search(@RequestBody GeneratorGuideSearchWebRequest request) {
        GeneratorGuideSearchParameter parameter = new GeneratorGuideSearchParameter();
        BeanUtils.copyProperties(request, parameter);
        
        PageResult<GeneratorGuide> generatorGuidePageResult = generatorGuideService.search(parameter);
        
        PageResult<GeneratorGuideSearchWebVo> generatorGuideSearchWebVoPageResult = new PageResult<>();
        generatorGuideSearchWebVoPageResult.setTotal(generatorGuidePageResult.getTotal());
        List<GeneratorGuideSearchWebVo> generatorGuideSearchWebVoList = generatorGuideSearchWebVoPageResult.getRecords();
        generatorGuidePageResult.getRecords().forEach(generatorGuide -> {
            GeneratorGuideSearchWebVo generatorGuideSearchWebVo = new GeneratorGuideSearchWebVo();
            BeanUtils.copyProperties(generatorGuide, generatorGuideSearchWebVo);
            generatorGuideSearchWebVoList.add(generatorGuideSearchWebVo);
        });

        return new Response<>(generatorGuideSearchWebVoPageResult);
    }
*/
    @AuthSecurity(developer = true)
    @ApiOperation(value = "生成器指南保存")
    @PostMapping(value = "/generatorGuide/save")
    public @ResponseBody Response<GeneratorGuideSaveWebVo> save(@RequestBody GeneratorGuideSaveWebRequest request) {
        GeneratorGuideSaveParameter parameter = new GeneratorGuideSaveParameter();
        BeanUtils.copyProperties(request, parameter);

        GeneratorGuide generatorGuide = generatorGuideService.save(parameter);

        GeneratorGuideSaveWebVo generatorGuideSaveWebVo = new GeneratorGuideSaveWebVo();
        BeanUtils.copyProperties(generatorGuide, generatorGuideSaveWebVo);

        return new Response<>(generatorGuideSaveWebVo);
    }
}

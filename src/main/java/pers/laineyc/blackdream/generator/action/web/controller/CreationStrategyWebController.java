package pers.laineyc.blackdream.generator.action.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.laineyc.blackdream.configuration.config.AuthSecurity;
import pers.laineyc.blackdream.framework.util.BeanUtils;
import pers.laineyc.blackdream.framework.controller.BaseWebController;
import pers.laineyc.blackdream.generator.action.web.request.*;
import pers.laineyc.blackdream.generator.action.web.response.*;
import pers.laineyc.blackdream.generator.action.web.vo.*;
import pers.laineyc.blackdream.generator.service.parameter.*;
import pers.laineyc.blackdream.framework.model.PageResult;
import pers.laineyc.blackdream.generator.service.domain.CreationStrategy;
import pers.laineyc.blackdream.generator.service.CreationStrategyService;
import java.util.List;

/**
 * 生成器生成策略Controller
 * @author LaineyC
 */
@Api(tags = "CreationStrategy", description = "生成器生成策略接口")
@Controller
public class CreationStrategyWebController extends BaseWebController {

    @Autowired
    private CreationStrategyService creationStrategyService;
    
    public CreationStrategyWebController() {

    }

    @AuthSecurity(developer = true)
    @ApiOperation(value = "生成器生成策略创建")
    @PostMapping(value = "/creationStrategy/create")
    public @ResponseBody CreationStrategyCreateWebResponse create(@RequestBody CreationStrategyCreateWebRequest request) {
        CreationStrategyCreateParameter parameter = new CreationStrategyCreateParameter();
        BeanUtils.copyProperties(request, parameter);

        CreationStrategy creationStrategy = creationStrategyService.create(parameter);

        CreationStrategyCreateWebVo creationStrategyCreateWebVo = new CreationStrategyCreateWebVo();
        BeanUtils.copyProperties(creationStrategy, creationStrategyCreateWebVo);

        return new CreationStrategyCreateWebResponse(creationStrategyCreateWebVo);
    }
/*
    @Security
    @ApiOperation(value = "生成器生成策略删除")
    @PostMapping(value = "/creationStrategy/delete")
    public @ResponseBody CreationStrategyDeleteWebResponse delete(@RequestBody CreationStrategyDeleteWebRequest request) {
        CreationStrategyDeleteParameter parameter = new CreationStrategyDeleteParameter();
        BeanUtils.copyProperties(request, parameter);

        CreationStrategy creationStrategy = creationStrategyService.delete(parameter);

        CreationStrategyDeleteWebVo creationStrategyDeleteWebVo = new CreationStrategyDeleteWebVo();
        BeanUtils.copyProperties(creationStrategy, creationStrategyDeleteWebVo);

        return new CreationStrategyDeleteWebResponse(creationStrategyDeleteWebVo);
    }
*/
    @AuthSecurity(developer = true)
    @ApiOperation(value = "生成器生成策略修改")
    @PostMapping(value = "/creationStrategy/update")
    public @ResponseBody CreationStrategyUpdateWebResponse update(@RequestBody CreationStrategyUpdateWebRequest request) {
        CreationStrategyUpdateParameter parameter = new CreationStrategyUpdateParameter();
        BeanUtils.copyProperties(request, parameter);

        CreationStrategy creationStrategy = creationStrategyService.update(parameter);
        
        CreationStrategyUpdateWebVo creationStrategyUpdateWebVo = new CreationStrategyUpdateWebVo();
        BeanUtils.copyProperties(creationStrategy, creationStrategyUpdateWebVo);

        return new CreationStrategyUpdateWebResponse(creationStrategyUpdateWebVo);
    }

    @ApiOperation(value = "生成器生成策略单个查询")
    @PostMapping(value = "/creationStrategy/get")
    public @ResponseBody CreationStrategyGetWebResponse get(@RequestBody CreationStrategyGetWebRequest request) {
        CreationStrategyGetParameter parameter = new CreationStrategyGetParameter();
        BeanUtils.copyProperties(request, parameter);

        CreationStrategy creationStrategy = creationStrategyService.get(parameter);
        
        CreationStrategyGetWebVo creationStrategyGetWebVo = new CreationStrategyGetWebVo();
        BeanUtils.copyProperties(creationStrategy, creationStrategyGetWebVo);
        
        return new CreationStrategyGetWebResponse(creationStrategyGetWebVo);
    }
/*
    @ApiOperation(value="生成器生成策略多个查询")
    @PostMapping(value = "/creationStrategy/query")
    public @ResponseBody CreationStrategyQueryWebResponse query(@RequestBody CreationStrategyQueryWebRequest request) {
        CreationStrategyQueryParameter parameter = new CreationStrategyQueryParameter();
        BeanUtils.copyProperties(request, parameter);
        
        List<CreationStrategy> creationStrategyList = creationStrategyService.query(parameter);
        
        List<CreationStrategyQueryWebVo> creationStrategyQueryWebVoList = new ArrayList<>();
        creationStrategyList.forEach(creationStrategy -> {
            CreationStrategyQueryWebVo creationStrategyQueryWebVo = new CreationStrategyQueryWebVo();
            BeanUtils.copyProperties(creationStrategy, creationStrategyQueryWebVo);
            creationStrategyQueryWebVoList.add(creationStrategyQueryWebVo);
        });

        return new CreationStrategyQueryWebResponse(creationStrategyQueryWebVoList);
    }

    @ApiOperation(value = "生成器生成策略分页查询")
    @PostMapping(value = "/creationStrategy/search")
    public @ResponseBody CreationStrategySearchWebResponse search(@RequestBody CreationStrategySearchWebRequest request) {
        CreationStrategySearchParameter parameter = new CreationStrategySearchParameter();
        BeanUtils.copyProperties(request, parameter);
        
        PageResult<CreationStrategy> creationStrategyPageResult = creationStrategyService.search(parameter);
        
        PageResult<CreationStrategySearchWebVo> creationStrategySearchWebVoPageResult = new PageResult<>();
        creationStrategySearchWebVoPageResult.setTotal(creationStrategyPageResult.getTotal());
        List<CreationStrategySearchWebVo> creationStrategySearchWebVoList = creationStrategySearchWebVoPageResult.getRecords();
        creationStrategyPageResult.getRecords().forEach(creationStrategy -> {
            CreationStrategySearchWebVo creationStrategySearchWebVo = new CreationStrategySearchWebVo();
            BeanUtils.copyProperties(creationStrategy, creationStrategySearchWebVo);
            creationStrategySearchWebVoList.add(creationStrategySearchWebVo);
        });

        return new CreationStrategySearchWebResponse(creationStrategySearchWebVoPageResult);
    }
*/
    @AuthSecurity(developer = true)
    @ApiOperation(value = "生成器生成策略排序")
    @PostMapping(value = "/creationStrategy/sort")
    public @ResponseBody CreationStrategySortWebResponse sort(@RequestBody CreationStrategySortWebRequest request) {
        CreationStrategySortParameter parameter = new CreationStrategySortParameter();
        BeanUtils.copyProperties(request, parameter);

        CreationStrategy creationStrategy = creationStrategyService.sort(parameter);

        CreationStrategySortWebVo creationStrategySortWebVo = new CreationStrategySortWebVo();
        BeanUtils.copyProperties(creationStrategy, creationStrategySortWebVo);

        return new CreationStrategySortWebResponse(creationStrategySortWebVo);
    }

    @AuthSecurity(developer = true)
    @ApiOperation(value = "生成器生成策略分页查询")
    @PostMapping(value = "/creationStrategy/infoSearch")
    public @ResponseBody CreationStrategyInfoSearchWebResponse infoSearch(@RequestBody CreationStrategyInfoSearchWebRequest request) {
        CreationStrategyInfoSearchParameter parameter = new CreationStrategyInfoSearchParameter();
        BeanUtils.copyProperties(request, parameter);

        PageResult<CreationStrategy> creationStrategyPageResult = creationStrategyService.infoSearch(parameter);

        PageResult<CreationStrategyInfoSearchWebVo> creationStrategyInfoSearchWebVoPageResult = new PageResult<>();
        creationStrategyInfoSearchWebVoPageResult.setTotal(creationStrategyPageResult.getTotal());
        List<CreationStrategyInfoSearchWebVo> creationStrategySearchWebVoList = creationStrategyInfoSearchWebVoPageResult.getRecords();
        creationStrategyPageResult.getRecords().forEach(creationStrategy -> {
            CreationStrategyInfoSearchWebVo creationStrategySearchWebVo = new CreationStrategyInfoSearchWebVo();
            BeanUtils.copyProperties(creationStrategy, creationStrategySearchWebVo);
            creationStrategySearchWebVoList.add(creationStrategySearchWebVo);
        });

        return new CreationStrategyInfoSearchWebResponse(creationStrategyInfoSearchWebVoPageResult);
    }
    
}

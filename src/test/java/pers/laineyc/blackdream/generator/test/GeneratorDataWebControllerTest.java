package pers.laineyc.blackdream.generator.test;

import org.junit.Test;
import org.junit.Assert;
import pers.laineyc.blackdream.framework.controller.BaseWebControllerTest;
import pers.laineyc.blackdream.framework.controller.response.Response;
import pers.laineyc.blackdream.generator.action.web.request.GeneratorDataCreateWebRequest;
import pers.laineyc.blackdream.generator.action.web.request.GeneratorDataDeleteWebRequest;
import pers.laineyc.blackdream.generator.action.web.request.GeneratorDataUpdateWebRequest;
import pers.laineyc.blackdream.generator.action.web.request.GeneratorDataGetWebRequest;
import pers.laineyc.blackdream.generator.action.web.request.GeneratorDataQueryWebRequest;
import pers.laineyc.blackdream.generator.action.web.request.GeneratorDataSearchWebRequest;
import pers.laineyc.blackdream.generator.action.web.request.GeneratorDataTreeWebRequest;
import pers.laineyc.blackdream.generator.action.web.request.GeneratorDataSortWebRequest;
import pers.laineyc.blackdream.generator.service.domain.*;

/**
 * 生成器数据ControllerTest
 * @author LaineyC
 */
public class GeneratorDataWebControllerTest extends BaseWebControllerTest {

    public GeneratorDataWebControllerTest(){

    }

    /**
     * 生成器数据创建Test
     */
    @Test
    public void create() throws Exception {
        GeneratorDataCreateWebRequest request = new GeneratorDataCreateWebRequest();
        request.setGeneratorInstanceId("");
        request.setDataModelId("");
        request.setName("");
        request.setIsExpanded(false);
        request.setParentId("");
        Response<GeneratorData> response = execute(request, GeneratorData.class, "/generatorData/create");
        Assert.assertNotNull(response.getBody());
    }
    
    /**
     * 生成器数据删除Test
     */
    @Test
    public void delete() throws Exception {
        GeneratorDataDeleteWebRequest request = new GeneratorDataDeleteWebRequest();
        request.setId("");
        Response<GeneratorData> response = execute(request, GeneratorData.class, "/generatorData/delete");
        Assert.assertNotNull(response.getBody());
    }

    /**
     * 生成器数据修改Test
     */
    @Test
    public void update() throws Exception {
        GeneratorDataUpdateWebRequest request = new GeneratorDataUpdateWebRequest();
        request.setId("");
        request.setName("");
        request.setIsExpanded(false);
        request.setParentId("");
        Response<GeneratorData> response = execute(request, GeneratorData.class, "/generatorData/update");
        Assert.assertNotNull(response.getBody());
    }
    
    /**
     * 生成器数据单个查询Test
     */
    @Test
    public void get() throws Exception {
        GeneratorDataGetWebRequest request = new GeneratorDataGetWebRequest();
        request.setId("");
        Response<GeneratorData> response = execute(request, GeneratorData.class, "/generatorData/get");
        Assert.assertNotNull(response.getBody());
    }

    /**
     * 生成器数据多个查询Test
     */
    @Test
    public void query() throws Exception {
        GeneratorDataQueryWebRequest request = new GeneratorDataQueryWebRequest();
        request.setUserId("");
        request.setGeneratorId("");
        request.setGeneratorInstanceId("");
        request.setDataModelId("");
        request.setName("");
        request.setParentId("");
        Response<GeneratorData> response = execute(request, GeneratorData.class, "/generatorData/query");
        Assert.assertNotNull(response.getBody());
    }

    /**
     * 生成器数据分页查询Test
     */
    @Test
    public void search() throws Exception {
        GeneratorDataSearchWebRequest request = new GeneratorDataSearchWebRequest();
        request.setPage(1);
        request.setPageSize(10);
        request.setUserId("");
        request.setGeneratorId("");
        request.setGeneratorInstanceId("");
        request.setDataModelId("");
        request.setName("");
        request.setParentId("");
        Response<GeneratorData> response = execute(request, GeneratorData.class, "/generatorData/search");
        Assert.assertNotNull(response.getBody());
    }

    /**
     * 生成器数据树形查询Test
     */
    @Test
    public void tree() throws Exception {
        GeneratorDataTreeWebRequest request = new GeneratorDataTreeWebRequest();
        Response<GeneratorData> response = execute(request, GeneratorData.class, "/generatorData/tree");
        Assert.assertNotNull(response.getBody());
    }

    /**
     * 生成器数据排序Test
     */
    @Test
    public void sort() throws Exception {
        GeneratorDataSortWebRequest request = new GeneratorDataSortWebRequest();
        Response<GeneratorData> response = execute(request, GeneratorData.class, "/generatorData/sort");
        Assert.assertNotNull(response.getBody());
    }

}
package pers.laineyc.blackdream.foundation.test;

import org.junit.Test;
import org.junit.Assert;
import pers.laineyc.blackdream.foundation.service.domain.*;
import pers.laineyc.blackdream.framework.controller.BaseWebControllerTest;
import pers.laineyc.blackdream.foundation.action.web.request.DetachedFileGetWebRequest;
import pers.laineyc.blackdream.foundation.action.web.request.DetachedFileQueryWebRequest;
import pers.laineyc.blackdream.foundation.action.web.request.DetachedFileSearchWebRequest;
import pers.laineyc.blackdream.foundation.action.web.request.DetachedFileUploadWebRequest;
import pers.laineyc.blackdream.framework.controller.response.Response;

/**
 * 游离文件ControllerTest
 * @author LaineyC
 */
public class DetachedFileWebControllerTest extends BaseWebControllerTest {

    public DetachedFileWebControllerTest(){

    }

    /**
     * 游离文件单个查询Test
     */
    @Test
    public void get() throws Exception {
        DetachedFileGetWebRequest request = new DetachedFileGetWebRequest();
        request.setId("");
        Response<DetachedFile> response = execute(request, DetachedFile.class, "/detachedFile/get");
        Assert.assertNotNull(response.getBody());
    }

    /**
     * 游离文件多个查询Test
     */
    @Test
    public void query() throws Exception {
        DetachedFileQueryWebRequest request = new DetachedFileQueryWebRequest();
        request.setUserId("");
        request.setSize(0L);
        request.setName("");
        request.setExtension("");
        request.setContentType("");
        Response<DetachedFile> response = execute(request, DetachedFile.class, "/detachedFile/query");
        Assert.assertNotNull(response.getBody());
    }

    /**
     * 游离文件分页查询Test
     */
    @Test
    public void search() throws Exception {
        DetachedFileSearchWebRequest request = new DetachedFileSearchWebRequest();
        request.setPage(1);
        request.setPageSize(10);
        request.setUserId("");
        request.setSize(0L);
        request.setName("");
        request.setExtension("");
        request.setContentType("");
        Response<DetachedFile> response = execute(request, DetachedFile.class, "/detachedFile/search");
        Assert.assertNotNull(response.getBody());
    }

    /**
     * 游离文件上传Test
     */
    @Test
    public void upload() throws Exception {
        DetachedFileUploadWebRequest request = new DetachedFileUploadWebRequest();
        Response<DetachedFile> response = execute(request, DetachedFile.class, "/detachedFile/upload");
        Assert.assertNotNull(response.getBody());
    }

}
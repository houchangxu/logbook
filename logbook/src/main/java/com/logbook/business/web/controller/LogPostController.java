package com.logbook.business.web.controller;

import com.logbook.business.service.LogPostService;
import com.logbook.business.web.domain.LogPostPageVo;
import com.logbook.business.web.request.LogPostRequestParam;
import com.logbook.business.web.request.LogPublishParam;
import com.logbook.common.Response;
import com.logbook.util.COSClientUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
@Api(description = "帖子(首页)")
@RequestMapping(value = "/logbook/logPost")
@Slf4j
public class LogPostController {
    @Autowired
    LogPostService logPostService;

    @RequestMapping(value = "/getLogPostPage", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation("帖子列表分页查询（注：新闻热点单独提供接口）")
    public Response<List<LogPostPageVo>> getPage(@RequestBody LogPostRequestParam param) {
        return Response.ofSuccess(logPostService.getPage(param));
    }

    @PostMapping(value = "/publicPost")
    @ResponseBody
    @ApiOperation("发帖")
    public Response<List<LogPostPageVo>> publicPost(LogPublishParam param, @RequestParam("files") MultipartFile[] files, HttpServletRequest request) throws IOException {
//        for (MultipartFile file : files) {
//            COSClientUtil.getInstance().uploadFile2Cos(file);
//        }
        return Response.ofSuccess(null);
    }
}

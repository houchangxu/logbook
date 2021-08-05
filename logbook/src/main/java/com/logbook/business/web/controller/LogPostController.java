package com.logbook.business.web.controller;

import com.logbook.business.service.LogPostService;
import com.logbook.business.web.domain.LogPostVo;
import com.logbook.business.web.request.LogPostRequestParam;
import com.logbook.common.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(description = "帖子(首页)")
@RequestMapping(value = "/logbook/logPost")
public class LogPostController {
    @Autowired
    LogPostService logPostService;

    @RequestMapping(value = "/getlogPostPage", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation("帖子列表分页查询（注：新闻热点单独提供接口）")
    public Response<List<LogPostVo>> getPage(@RequestBody LogPostRequestParam param) {
        return Response.ofSuccess(logPostService.getPage(param));
    }
}

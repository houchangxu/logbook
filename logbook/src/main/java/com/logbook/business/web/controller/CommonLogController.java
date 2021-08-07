package com.logbook.business.web.controller;

import com.logbook.business.model.LogComForumEntity;
import com.logbook.business.model.LogComTopicEntity;
import com.logbook.business.model.LogTagEntity;
import com.logbook.business.service.*;
import com.logbook.common.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(description = "commonInfo")
@RequestMapping(value = "/logbook/common")
public class CommonLogController {
    @Autowired
    LogChannelService logChannelService;
    @Autowired
    LogTagService logTagService;
    @Autowired
    LogTopicService logTopicService;

    @RequestMapping(value = "/getAllChannel", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation("查询所有频道")
    public Response<List<LogComForumEntity>> getAllChannel() {
        return Response.ofSuccess(logChannelService.getAllChannel());
    }

    @RequestMapping(value = "/getAllTag", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation("查询所有标签")
    public Response<List<LogTagEntity>> getAllTag() {
        return Response.ofSuccess(logTagService.getAllTag());
    }

    @RequestMapping(value = "/getAllTopic", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation("查询所有话题")
    public Response<List<LogComTopicEntity>> getAllTopic() {
        return Response.ofSuccess(logTopicService.getAllTopic());
    }


//    @RequestMapping(value = "/getUserChannel/{uid}", method = RequestMethod.GET)
//    @ResponseBody
//    @ApiOperation("查询当前用户的频道")
//    public Response<List<LogChannelEntity>> getUserChannel(@PathVariable("uid")Integer uid) {
//        return Response.ofSuccess(logChannelService.getUserChannel(uid));
//    }

}

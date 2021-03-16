package com.venvo.service.solo.impl;

import com.venvo.entity.bo.HeadLine;
import com.venvo.entity.dto.Result;
import com.venvo.service.solo.HeadLineService;

import java.util.List;

/**
 * @author venvo
 * @date 2021-03-05 15:16
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class HeadLineServiceImpl implements HeadLineService {
    @Override
    public Result<Boolean> addHeadLine(HeadLine headLine) {
        return null;
    }

    @Override
    public Result<Boolean> removeHeadLine(int headLineId) {
        return null;
    }

    @Override
    public Result<Boolean> modifyHeadLine(HeadLine headLine) {
        return null;
    }

    @Override
    public Result<HeadLine> queryHeadLineById(int headLineId) {
        return null;
    }

    @Override
    public Result<List<HeadLine>> queryHeadLine(HeadLine headLineCondition, int pageIndex, int pageSize) {
        return null;
    }
}

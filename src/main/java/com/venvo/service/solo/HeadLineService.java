package com.venvo.service.solo;

import com.venvo.entity.bo.HeadLine;
import com.venvo.entity.dto.Result;

import java.util.List;

/**
 * @author venvo
 * @date 2021-03-05 14:44
 * @description
 * @modified By
 * @version: jdk1.8
 */
public interface HeadLineService {

    Result<Boolean> addHeadLine(HeadLine headLine);

    Result<Boolean> removeHeadLine(int headLineId);

    Result<Boolean> modifyHeadLine(HeadLine headLine);

    Result<HeadLine> queryHeadLineById(int headLineId);

    Result<List<HeadLine>> queryHeadLine(HeadLine headLineCondition,int pageIndex,int pageSize);

}

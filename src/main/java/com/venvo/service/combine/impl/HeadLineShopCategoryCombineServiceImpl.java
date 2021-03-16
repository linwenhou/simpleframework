package com.venvo.service.combine.impl;

import com.venvo.entity.bo.HeadLine;
import com.venvo.entity.bo.ShopCategory;
import com.venvo.entity.dto.MainPageInfoDTO;
import com.venvo.entity.dto.Result;
import com.venvo.service.combine.HeadLineShopCategoryCombineService;
import com.venvo.service.solo.HeadLineService;
import com.venvo.service.solo.ShopCategoryService;

import java.util.List;

/**
 * @author venvo
 * @date 2021-03-05 15:21
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class HeadLineShopCategoryCombineServiceImpl implements HeadLineShopCategoryCombineService {

    private HeadLineService headLineService;
    private ShopCategoryService shopCategoryService;

    @Override
    public Result<MainPageInfoDTO> getMainPageInfo() {

        //头条列表
        HeadLine headLine = new HeadLine();
        headLine.setEnableStatus(1);
        Result<List<HeadLine>> headLineResult = headLineService.queryHeadLine(headLine, 1, 4);
        //店铺类别列表
        ShopCategory shopCategory = new ShopCategory();
        Result<List<ShopCategory>> shopCategoryResult = shopCategoryService.queryShopCategory(shopCategory, 1, 100);
        //合并两者
        Result<MainPageInfoDTO> result = mergeMainPageInfoResult(headLineResult, shopCategoryResult);


        return result;
    }

    private Result<MainPageInfoDTO> mergeMainPageInfoResult(Result<List<HeadLine>> headLineResult, Result<List<ShopCategory>> shopCategoryResult) {
        return null;

    }
}

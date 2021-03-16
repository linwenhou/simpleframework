package com.venvo.controller.superadmin;

import com.venvo.entity.bo.HeadLine;
import com.venvo.entity.bo.ShopCategory;
import com.venvo.entity.dto.Result;
import com.venvo.service.solo.HeadLineService;
import com.venvo.service.solo.ShopCategoryService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author venvo
 * @date 2021-03-05 17:49
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class ShopCategoryOperationController {

    private ShopCategoryService shopCategoryService;

    public Result<Boolean> addHeadLine(HttpServletRequest req, HttpServletResponse resp) {
        //todo
        return shopCategoryService.addShopCategory(new ShopCategory());
    }

    public Result<Boolean> removeHeadLine(HttpServletRequest req, HttpServletResponse resp) {
        //todo
        return shopCategoryService.removeShopCategory(1);
    }

    public Result<Boolean> modifyHeadLine(HttpServletRequest req, HttpServletResponse resp) {
        //todo
        return shopCategoryService.modifyShopCategory(new ShopCategory());
    }

    public Result<ShopCategory> queryHeadLineById(HttpServletRequest req, HttpServletResponse resp) {
        //todo
        return shopCategoryService.queryShopCategoryById(1);
    }

    public Result<List<ShopCategory>> queryHeadLine(HttpServletRequest req, HttpServletResponse resp) {
        //todo
        return shopCategoryService.queryShopCategory(new ShopCategory(), 1, 10);
    }
}

package com.venvo.service.solo.impl;

import com.venvo.entity.bo.ShopCategory;
import com.venvo.entity.dto.Result;
import com.venvo.service.solo.ShopCategoryService;

import java.util.List;

/**
 * @author venvo
 * @date 2021-03-05 15:15
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class ShopCategoryServiceImpl implements ShopCategoryService {
    @Override
    public Result<Boolean> addShopCategory(ShopCategory shopCategory) {
        return null;
    }

    @Override
    public Result<Boolean> removeShopCategory(int shopCategoryId) {
        return null;
    }

    @Override
    public Result<Boolean> modifyShopCategory(ShopCategory shopCategory) {
        return null;
    }

    @Override
    public Result<ShopCategory> queryShopCategoryById(int shopCategoryId) {
        return null;
    }

    @Override
    public Result<List<ShopCategory>> queryShopCategory(ShopCategory shopCategoryCondition, int pageIndex, int pageSize) {
        return null;
    }
}

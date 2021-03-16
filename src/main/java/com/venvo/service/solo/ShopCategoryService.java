package com.venvo.service.solo;

import com.venvo.entity.bo.ShopCategory;
import com.venvo.entity.dto.Result;

import java.util.List;

/**
 * @author venvo
 * @date 2021-03-05 14:44
 * @description
 * @modified By
 * @version: jdk1.8
 */
public interface ShopCategoryService {


    Result<Boolean> addShopCategory(ShopCategory shopCategory);

    Result<Boolean> removeShopCategory(int shopCategoryId);

    Result<Boolean> modifyShopCategory(ShopCategory shopCategory);

    Result<ShopCategory> queryShopCategoryById(int shopCategoryId);

    Result<List<ShopCategory>> queryShopCategory(ShopCategory shopCategoryCondition, int pageIndex, int pageSize);

}

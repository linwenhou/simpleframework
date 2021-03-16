package com.venvo.entity.dto;

import com.venvo.entity.bo.HeadLine;
import com.venvo.entity.bo.ShopCategory;
import lombok.Data;

import java.util.List;

/**
 * @author venvo
 * @date 2021-03-05 15:18
 * @description
 * @modified By
 * @version: jdk1.8
 */
@Data
public class MainPageInfoDTO {
    private List<HeadLine> headLineList;
    private List<ShopCategory> shopCategoryList;
}

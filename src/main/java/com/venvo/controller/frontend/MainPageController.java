package com.venvo.controller.frontend;

import com.venvo.entity.dto.MainPageInfoDTO;
import com.venvo.entity.dto.Result;
import com.venvo.service.combine.HeadLineShopCategoryCombineService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author venvo
 * @date 2021-03-05 17:33
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class MainPageController {

    private HeadLineShopCategoryCombineService headLineShopCategoryCombineService;

    public Result<MainPageInfoDTO> getMainPageInfo(HttpServletRequest req, HttpServletResponse res) {
        return headLineShopCategoryCombineService.getMainPageInfo();
    }


}

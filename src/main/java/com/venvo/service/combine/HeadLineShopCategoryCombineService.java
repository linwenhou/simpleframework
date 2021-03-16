package com.venvo.service.combine;

import com.venvo.entity.dto.MainPageInfoDTO;
import com.venvo.entity.dto.Result;

/**
 * @author venvo
 * @date 2021-03-05 15:17
 * @description
 * @modified By
 * @version: jdk1.8
 */
public interface HeadLineShopCategoryCombineService {
    Result<MainPageInfoDTO> getMainPageInfo();
}

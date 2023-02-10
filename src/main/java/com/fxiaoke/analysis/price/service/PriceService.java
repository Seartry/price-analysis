package com.fxiaoke.analysis.price.service;

import com.fxiaoke.analysis.price.model.vo.OcrData;
import com.fxiaoke.analysis.price.model.vo.PriceVO;

import java.util.List;

/**
 * @author zhangxiaopan
 * @create 2023 - 02 - 10  17:05
 **/
public interface PriceService {

    PriceVO analysisInputData(List<OcrData> ocrDataList);

}

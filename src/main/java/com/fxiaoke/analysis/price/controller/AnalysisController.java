package com.fxiaoke.analysis.price.controller;

import com.fxiaoke.analysis.price.model.vo.OcrData;
import com.fxiaoke.analysis.price.model.vo.PriceVO;
import com.fxiaoke.analysis.price.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhangxiaopan
 * @create 2023 - 02 - 10  17:04
 **/
@RestController("/analysis")
public class AnalysisController {

    @Autowired
    private PriceService priceService;

    @PostMapping("/ocr")
    public PriceVO analysisOcr(List<OcrData> ocrDataList){
        return priceService.analysisInputData(ocrDataList);
    }


}

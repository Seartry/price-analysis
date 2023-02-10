package com.fxiaoke.analysis.price.service;

import com.fxiaoke.analysis.price.handler.AnalysisHandler;
import com.fxiaoke.analysis.price.model.po.PriceData;
import com.fxiaoke.analysis.price.model.vo.OcrData;
import com.fxiaoke.analysis.price.model.vo.PriceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangxiaopan
 * @create 2023 - 02 - 10  17:06
 **/
@Service
public class PriceServiceImpl implements PriceService{

    @Autowired
    private AnalysisHandler analysisHandler;

    @Override
    public PriceVO analysisInputData(List<OcrData> ocrDataList) {

        List<List<OcrData>> groupOcrData = analysisHandler.groupOcrData(ocrDataList);
        List<PriceData> priceData = analysisHandler.analysisPriceList(groupOcrData);

        return PriceVO.builder().list(priceData).build();
    }
}

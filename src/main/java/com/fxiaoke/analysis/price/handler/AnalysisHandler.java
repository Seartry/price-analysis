package com.fxiaoke.analysis.price.handler;

import com.fxiaoke.analysis.price.model.po.PriceData;
import com.fxiaoke.analysis.price.model.vo.OcrData;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * @author zhangxiaopan
 * @create 2023 - 02 - 10  17:21
 **/
@Service
public class AnalysisHandler {

    public List<List<OcrData>> groupOcrData(List<OcrData> list){
        List<List<OcrData>> result = Lists.newArrayList();
        if (CollectionUtils.isEmpty(list)){
            return result;
        }
        //按照距离顶部的距离正排序
        list.sort(Comparator.comparing(ocrData -> ocrData.getLocation().getTop()));

        //求字体是否在同一行的最低误差标准
        OptionalDouble average = list.stream().mapToDouble(ocrData -> ocrData.getLocation().getHeight()).average();

        //依次求距离上一个识别文本的垂直差
        for (int i = 1; i < list.size(); i++) {
            list.get(i).setTopDValue(list.get(i).getLocation().getTop() - list.get(i-1).getLocation().getTop());
            
        }

        //按照距离分组





        return result;
    }

    public List<PriceData> analysisPriceList(List<List<OcrData>> groupList){
        List<PriceData> list = Lists.newArrayList();
        if (CollectionUtils.isEmpty(groupList)){
            return list;
        }

        list = groupList.stream().map(this::analysisPrice).collect(Collectors.toList());

        return list;

    }

    private PriceData analysisPrice(List<OcrData> group){

        if (CollectionUtils.isEmpty(group)){
            return null;
        }

        PriceData priceData = new PriceData();

        group.forEach(ocrData->{

        });

        return priceData;

    }



}

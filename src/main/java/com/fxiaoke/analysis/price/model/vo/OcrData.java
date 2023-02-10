package com.fxiaoke.analysis.price.model.vo;

import com.fxiaoke.analysis.price.model.BaseData;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author zhangxiaopan
 * @create 2023 - 02 - 10  17:09
 **/
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class OcrData extends BaseData {

    private String words;

    private Location location;

    private double topDValue;

    @Data
    public static class Location{

        private double top;

        private double left;

        private double width;

        private double height;

    }

}

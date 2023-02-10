package com.fxiaoke.analysis.price.model.po;

import com.fxiaoke.analysis.price.model.BaseData;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author zhangxiaopan
 * @create 2023 - 02 - 10  17:13
 **/
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class PriceData extends BaseData {

    private Integer id;

    private String name;

    private double price;

}

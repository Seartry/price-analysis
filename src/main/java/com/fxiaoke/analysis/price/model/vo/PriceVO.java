package com.fxiaoke.analysis.price.model.vo;

import com.fxiaoke.analysis.price.model.BaseData;
import com.fxiaoke.analysis.price.model.po.PriceData;
import lombok.*;

import java.util.List;

/**
 * @author zhangxiaopan
 * @create 2023 - 02 - 10  17:15
 **/
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PriceVO extends BaseData {

    private List<PriceData> list;

}

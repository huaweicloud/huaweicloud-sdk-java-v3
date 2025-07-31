package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释** 是否开启聚合 **约束限制** 当RollupEnable开启时，RollupFilter和RollupDimension必填 **取值范围** true，表示开启聚合；false表示不开启聚合 **默认取值** false 
 */
public class RollupEnable {

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RollupEnable {\n");
        sb.append("}");
        return sb.toString();
    }

}

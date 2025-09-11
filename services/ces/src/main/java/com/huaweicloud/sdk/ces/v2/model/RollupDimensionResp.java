package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释** 聚合维度 **取值范围** 长度为[1,32]个字符 
 */
public class RollupDimensionResp {

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
        sb.append("class RollupDimensionResp {\n");
        sb.append("}");
        return sb.toString();
    }

}

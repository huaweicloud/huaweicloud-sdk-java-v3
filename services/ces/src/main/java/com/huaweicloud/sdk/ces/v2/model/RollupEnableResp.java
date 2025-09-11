package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释** 是否开启聚合 **取值范围** - true：表示开启聚合 - false：表示不开启聚合 
 */
public class RollupEnableResp {

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
        sb.append("class RollupEnableResp {\n");
        sb.append("}");
        return sb.toString();
    }

}

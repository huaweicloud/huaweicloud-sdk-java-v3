package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 用户在页面中选择的指标单位， 用于后续指标数据回显和计算。     **约束限制**： 不涉及。 **取值范围**： 长度为[0,64]个字符。        **默认取值**： 不涉及。 
 */
public class SelectedUnit {

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
        sb.append("class SelectedUnit {\n");
        sb.append("}");
        return sb.toString();
    }

}

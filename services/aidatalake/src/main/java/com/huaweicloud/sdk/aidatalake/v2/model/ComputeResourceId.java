package com.huaweicloud.sdk.aidatalake.v2.model;

import java.util.Objects;

/**
 * **参数解释**：计算资源ID。 **取值范围**：长度为1~36个英文字母、数字和中划线的组合。 
 */
public class ComputeResourceId {

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
        sb.append("class ComputeResourceId {\n");
        sb.append("}");
        return sb.toString();
    }

}

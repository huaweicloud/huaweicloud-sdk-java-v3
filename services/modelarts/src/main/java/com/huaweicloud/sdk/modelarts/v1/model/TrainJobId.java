package com.huaweicloud.sdk.modelarts.v1.model;

import java.util.Objects;

/**
 * **参数解释**：作业对象，训练作业ID。  **约束限制**：offering取值为STANDARD时生效。  **取值范围**：仅允许输入合法的UUID字符串，且开头和结尾不能有空格。  **默认取值**：不涉及。
 */
public class TrainJobId {

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
        sb.append("class TrainJobId {\n");
        sb.append("}");
        return sb.toString();
    }

}

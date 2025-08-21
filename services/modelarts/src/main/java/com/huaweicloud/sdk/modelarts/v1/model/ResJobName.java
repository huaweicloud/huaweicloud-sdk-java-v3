package com.huaweicloud.sdk.modelarts.v1.model;

import java.util.Objects;

/**
 * **参数解释**：作业名称。  **取值范围**：只允许输入长度为 1 到 64 位由数字、中文、英文、下划线（_）或中划线（-）组成的字符。
 */
public class ResJobName {

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
        sb.append("class ResJobName {\n");
        sb.append("}");
        return sb.toString();
    }

}

package com.huaweicloud.sdk.modelarts.v1.model;

import java.util.Objects;

/**
 * **参数解释**：网络诊断作业诊断结束时间。 **约束限制**：使用UTC时间格式。 **取值范围**：不涉及。 **默认取值**：不涉及。
 */
public class NetworkJobDiagnosisEndTime {

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
        sb.append("class NetworkJobDiagnosisEndTime {\n");
        sb.append("}");
        return sb.toString();
    }

}

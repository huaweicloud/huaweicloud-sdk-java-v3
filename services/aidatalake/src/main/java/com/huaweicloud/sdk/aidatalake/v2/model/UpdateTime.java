package com.huaweicloud.sdk.aidatalake.v2.model;

import java.util.Objects;

/**
 * **参数解释**：资源更新时间，使用UTC时间，ISO 8601格式，例如：2025-01-10T03:37:12.000+00:00。 **取值范围**：不涉及。 
 */
public class UpdateTime {

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
        sb.append("class UpdateTime {\n");
        sb.append("}");
        return sb.toString();
    }

}

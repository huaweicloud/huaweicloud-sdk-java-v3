package com.huaweicloud.sdk.codeartscheck.v2.model;

import java.util.Objects;

/**
 * **参数解释：** 问题级别。 **取值范围：** - 0：致命。 - 1：严重。 - 2：一般。 - 3：提示。
 */
public class DefectLevelInResponse {

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
        sb.append("class DefectLevelInResponse {\n");
        sb.append("}");
        return sb.toString();
    }

}

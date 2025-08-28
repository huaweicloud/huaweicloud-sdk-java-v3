package com.huaweicloud.sdk.sts.v1.model;

import java.util.Objects;

/**
 * 标签键，仅包含key字段。
 */
public class TagKeyDto {

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
        sb.append("class TagKeyDto {\n");
        sb.append("}");
        return sb.toString();
    }

}

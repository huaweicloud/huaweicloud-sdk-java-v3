package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 聚合方式, 支持的值为(average|min|max|sum)
 */
public class Filter {

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
        sb.append("class Filter {\n");
        sb.append("}");
        return sb.toString();
    }

}

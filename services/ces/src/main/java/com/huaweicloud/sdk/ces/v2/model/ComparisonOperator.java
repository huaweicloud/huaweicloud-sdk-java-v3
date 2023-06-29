package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 阈值符号, 支持的值为(&gt;|&lt;|&gt;&#x3D;|&lt;&#x3D;|&#x3D;|&gt;&lt;)
 */
public class ComparisonOperator {

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
        sb.append("class ComparisonOperator {\n");
        sb.append("}");
        return sb.toString();
    }

}

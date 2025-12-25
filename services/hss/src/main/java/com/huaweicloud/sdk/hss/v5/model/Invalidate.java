package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * 失效，包含如下:   - true ：是   - false ：否
 */
public class Invalidate {

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
        sb.append("class Invalidate {\n");
        sb.append("}");
        return sb.toString();
    }

}

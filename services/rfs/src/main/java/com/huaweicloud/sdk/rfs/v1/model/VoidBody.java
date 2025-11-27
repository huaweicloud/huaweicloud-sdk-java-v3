package com.huaweicloud.sdk.rfs.v1.model;

import java.util.Objects;

/**
 * 空响应体
 */
public class VoidBody {

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
        sb.append("class VoidBody {\n");
        sb.append("}");
        return sb.toString();
    }

}

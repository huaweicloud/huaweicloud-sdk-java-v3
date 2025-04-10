package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * 排除目录，多个用;分隔
 */
public class IgnoreDir {

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
        sb.append("class IgnoreDir {\n");
        sb.append("}");
        return sb.toString();
    }

}

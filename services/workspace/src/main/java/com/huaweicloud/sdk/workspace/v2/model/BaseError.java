package com.huaweicloud.sdk.workspace.v2.model;

import java.util.Objects;

/**
 * API响应基类，用于老接口200响应，对文档不呈现。
 */
public class BaseError {

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
        sb.append("class BaseError {\n");
        sb.append("}");
        return sb.toString();
    }

}

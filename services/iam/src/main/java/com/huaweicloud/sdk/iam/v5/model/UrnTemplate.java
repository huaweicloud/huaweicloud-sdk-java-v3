package com.huaweicloud.sdk.iam.v5.model;

import java.util.Objects;

/**
 * 统一资源名称模板，表示可以通过这类资源的统一资源名称对该授权项进行资源粒度的授权。
 */
public class UrnTemplate {

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
        sb.append("class UrnTemplate {\n");
        sb.append("}");
        return sb.toString();
    }

}

package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 查询服务的命名空间，各服务命名空间请参考“[服务维度名称](ces_03_0059.xml)”
 */
public class NamespaceAllowedEmpty {

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
        sb.append("class NamespaceAllowedEmpty {\n");
        sb.append("}");
        return sb.toString();
    }

}

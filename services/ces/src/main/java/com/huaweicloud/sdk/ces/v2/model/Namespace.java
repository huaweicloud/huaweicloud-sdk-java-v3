package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 查询服务的命名空间，各服务命名空间请参考“[服务命名空间](ces_03_0059.xml)”
 */
public class Namespace {

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
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
        sb.append("class Namespace {\n");
        sb.append("}");
        return sb.toString();
    }

}

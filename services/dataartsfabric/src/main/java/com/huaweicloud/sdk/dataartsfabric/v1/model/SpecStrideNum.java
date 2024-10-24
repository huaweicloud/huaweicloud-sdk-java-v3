package com.huaweicloud.sdk.dataartsfabric.v1.model;

import java.util.Objects;

/**
 * 资源步数，最小为10000，步长为1。输入范围还需要满足规格列表接口的步长白名单
 */
public class SpecStrideNum {

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
        sb.append("class SpecStrideNum {\n");
        sb.append("}");
        return sb.toString();
    }

}

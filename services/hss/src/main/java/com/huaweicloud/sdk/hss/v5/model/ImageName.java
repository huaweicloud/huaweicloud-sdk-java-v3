package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * 镜像名称，只有容器类型的告警有
 */
public class ImageName {

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
        sb.append("class ImageName {\n");
        sb.append("}");
        return sb.toString();
    }

}

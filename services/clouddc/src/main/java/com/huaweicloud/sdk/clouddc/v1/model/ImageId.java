package com.huaweicloud.sdk.clouddc.v1.model;

import java.util.Objects;

/**
 * 镜像ID，非必填，不传默认使用当前镜像ID
 */
public class ImageId {

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
        sb.append("class ImageId {\n");
        sb.append("}");
        return sb.toString();
    }

}

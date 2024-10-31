package com.huaweicloud.sdk.dataartsfabricep.v1.model;

import java.util.Objects;

/**
 * 一种资源ID，32~36位的英文、数字、短横组合
 */
public class ResourceId {

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
        sb.append("class ResourceId {\n");
        sb.append("}");
        return sb.toString();
    }

}

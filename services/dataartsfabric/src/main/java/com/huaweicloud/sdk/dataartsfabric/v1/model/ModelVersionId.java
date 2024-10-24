package com.huaweicloud.sdk.dataartsfabric.v1.model;

import java.util.Objects;

/**
 * 模型版本ID，32~36位的英文、数字、短横组合，系统自动生成无法修改，输入不生效。
 */
public class ModelVersionId {

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
        sb.append("class ModelVersionId {\n");
        sb.append("}");
        return sb.toString();
    }

}

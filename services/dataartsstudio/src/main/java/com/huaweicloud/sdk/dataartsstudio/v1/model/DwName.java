package com.huaweicloud.sdk.dataartsstudio.v1.model;

import java.util.Objects;

/**
 * 数据连接名称，只读，创建和更新时无需填写。
 */
public class DwName {

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
        sb.append("class DwName {\n");
        sb.append("}");
        return sb.toString();
    }

}

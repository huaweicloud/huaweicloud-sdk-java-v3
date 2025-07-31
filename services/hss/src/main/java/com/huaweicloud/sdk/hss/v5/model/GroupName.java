package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * **参数解释**: 服务器组名称 **取值范围**: 字符长度0-256位 
 */
public class GroupName {

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
        sb.append("class GroupName {\n");
        sb.append("}");
        return sb.toString();
    }

}

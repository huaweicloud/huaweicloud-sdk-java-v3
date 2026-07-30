package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import java.util.Objects;

/**
 * **参数解释**：Session的ID。 **取值范围**：长度为1~36个字符，支持大小写英文字母、数字、连字符。
 */
public class SqlSessionId {

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
        sb.append("class SqlSessionId {\n");
        sb.append("}");
        return sb.toString();
    }

}

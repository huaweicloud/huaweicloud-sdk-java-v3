package com.huaweicloud.sdk.aidatalake.v2.model;

import java.util.Objects;

/**
 * **参数解释**：端点显示名称。 **取值范围**：长度为1~63个字符，支持字母、数字、中划线、汉字。 
 */
public class V2EndpointDisplayName {

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
        sb.append("class V2EndpointDisplayName {\n");
        sb.append("}");
        return sb.toString();
    }

}

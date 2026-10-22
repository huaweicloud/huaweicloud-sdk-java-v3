package com.huaweicloud.sdk.aidatalake.v2.model;

import java.util.Objects;

/**
 * **参数解释**：端点名称。 **取值范围**：支持小写字母、数字、中划线，必须字母开头、字母或数字结尾，长度为1~63个字符。 
 */
public class V2EndpointName {

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
        sb.append("class V2EndpointName {\n");
        sb.append("}");
        return sb.toString();
    }

}

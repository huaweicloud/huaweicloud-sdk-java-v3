package com.huaweicloud.sdk.dws.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 请求成功时的空白响应。 **取值范围**： 不涉及。
 */
public class EmptyResponse {

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
        sb.append("class EmptyResponse {\n");
        sb.append("}");
        return sb.toString();
    }

}

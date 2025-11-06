package com.huaweicloud.sdk.ces.v1.model;

import java.util.Objects;

/**
 * **参数解释**： 告警描述。 **取值范围**： 长度[0,256]个字符。 
 */
public class AlarmDescriptionResp {

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
        sb.append("class AlarmDescriptionResp {\n");
        sb.append("}");
        return sb.toString();
    }

}

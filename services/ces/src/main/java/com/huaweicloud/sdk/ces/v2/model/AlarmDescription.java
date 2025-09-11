package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 告警描述。     **约束限制**： 不涉及。 **取值范围**： 长度为[0,256]个字符。        **默认取值**： 不涉及。 
 */
public class AlarmDescription {

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
        sb.append("class AlarmDescription {\n");
        sb.append("}");
        return sb.toString();
    }

}

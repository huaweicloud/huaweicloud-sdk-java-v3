package com.huaweicloud.sdk.ces.v1.model;

import java.util.Objects;

/**
 * **参数解释**： 告警名称。 **约束限制**： 不涉及。 **取值范围**： 只能包含0-9/a-z/A-Z/_/-或汉字，长度1-128。 **默认取值**： 不涉及。 
 */
public class AlarmName {

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
        sb.append("class AlarmName {\n");
        sb.append("}");
        return sb.toString();
    }

}

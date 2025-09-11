package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 告警规则id。     **约束限制**： 不涉及。 **取值范围**： 以al开头，后跟22个数字或字母。           **默认取值**： 不涉及。 
 */
public class AlarmID {

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
        sb.append("class AlarmID {\n");
        sb.append("}");
        return sb.toString();
    }

}

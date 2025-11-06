package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 告警规则id。如 al123232232341232132 **取值范围**： 以al开头，后跟22个数字或字母。长度为24个字符。 
 */
public class AlarmIDResp {

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
        sb.append("class AlarmIDResp {\n");
        sb.append("}");
        return sb.toString();
    }

}

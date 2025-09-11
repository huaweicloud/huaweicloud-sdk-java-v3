package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 是否开启告警规则。 **取值范围**： 布尔值。 - true:开启。 - false:关闭。 
 */
public class AlarmEnabledResp {

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
        sb.append("class AlarmEnabledResp {\n");
        sb.append("}");
        return sb.toString();
    }

}

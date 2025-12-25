package com.huaweicloud.sdk.ces.v1.model;

import java.util.Objects;

/**
 * **参数解释**： 告警级别。 **取值范围**： 取值为1、2、3、4 - 1：紧急 - 2：重要 - 3：次要 - 4：提示 
 */
public class AlarmLevelResp {

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
        sb.append("class AlarmLevelResp {\n");
        sb.append("}");
        return sb.toString();
    }

}

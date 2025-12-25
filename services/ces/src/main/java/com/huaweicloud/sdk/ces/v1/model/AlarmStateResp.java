package com.huaweicloud.sdk.ces.v1.model;

import java.util.Objects;

/**
 * **参数解释**： 告警状态。 **取值范围**： 只能为ok、alarm、insufficient_data。 - ok：正常 - alarm：告警 - insufficient_data：数据不足 
 */
public class AlarmStateResp {

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
        sb.append("class AlarmStateResp {\n");
        sb.append("}");
        return sb.toString();
    }

}

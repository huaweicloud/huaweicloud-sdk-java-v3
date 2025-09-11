package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 告警名称。     **取值范围**： 只能包含0-9/a-z/A-Z/_/-或汉字，长度[1，128]个字符。 
 */
public class AlarmNameResp {

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
        sb.append("class AlarmNameResp {\n");
        sb.append("}");
        return sb.toString();
    }

}

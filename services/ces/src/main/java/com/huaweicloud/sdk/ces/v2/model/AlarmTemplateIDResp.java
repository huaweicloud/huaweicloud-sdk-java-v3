package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 告警规则关联告警模板ID     **取值范围**： 以at开头，只包含字母、数字，长度为[2,64]个字符。 
 */
public class AlarmTemplateIDResp {

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
        sb.append("class AlarmTemplateIDResp {\n");
        sb.append("}");
        return sb.toString();
    }

}

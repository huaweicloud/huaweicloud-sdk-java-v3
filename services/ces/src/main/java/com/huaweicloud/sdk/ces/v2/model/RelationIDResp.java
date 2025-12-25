package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 关联ID       **取值范围**： 取值为告警规则ID、告警策略ID。只能包含字母、数字、“-”，长度为[1,64]个字符。 
 */
public class RelationIDResp {

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
        sb.append("class RelationIDResp {\n");
        sb.append("}");
        return sb.toString();
    }

}

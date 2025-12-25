package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 关联ID，为告警规则ID或者告警策略ID **约束限制**： 不涉及。 **取值范围**： 只能包含字母、数字、“-”，长度为[1,64]个字符。      **默认取值**： 不涉及。 
 */
public class RelationID {

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
        sb.append("class RelationID {\n");
        sb.append("}");
        return sb.toString();
    }

}

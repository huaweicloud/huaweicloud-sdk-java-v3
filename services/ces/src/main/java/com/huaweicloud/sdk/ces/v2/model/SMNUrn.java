package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 通知组、通知对象对应的SMN主题URN。 **约束限制**： 不涉及。 **取值范围**： 只能包含字母、数字、“-”、“_” 、“:”。     **默认取值**： 不涉及。 
 */
public class SMNUrn {

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
        sb.append("class SMNUrn {\n");
        sb.append("}");
        return sb.toString();
    }

}

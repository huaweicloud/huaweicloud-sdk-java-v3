package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 通知组、通知对象对应的SMN主题URN。 **取值范围**： 只能包含字母、数字、“-”、“_” 、“:”。 
 */
public class SMNUrnResp {

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
        sb.append("class SMNUrnResp {\n");
        sb.append("}");
        return sb.toString();
    }

}

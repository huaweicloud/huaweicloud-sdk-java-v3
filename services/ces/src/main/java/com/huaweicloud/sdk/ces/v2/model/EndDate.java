package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 屏蔽截止日期。           **约束限制**： 不涉及。 **取值范围**： 字符长度为10，格式为：yyyy-MM-dd           **默认取值**： 不涉及。 
 */
public class EndDate {

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
        sb.append("class EndDate {\n");
        sb.append("}");
        return sb.toString();
    }

}

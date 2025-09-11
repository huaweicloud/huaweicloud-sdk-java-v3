package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 告警级别。    **约束限制**： 不涉及。 **取值范围**： 只能为1、2、3、4。1为紧急，2为重要，3为次要，4为提示。         **默认取值**： 2 
 */
public class Level {

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
        sb.append("class Level {\n");
        sb.append("}");
        return sb.toString();
    }

}

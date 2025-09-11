package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 告警级别。    **取值范围**： 只能为1、2、3、4。1为紧急，2为重要，3为次要，4为提示。 
 */
public class LevelResp {

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
        sb.append("class LevelResp {\n");
        sb.append("}");
        return sb.toString();
    }

}

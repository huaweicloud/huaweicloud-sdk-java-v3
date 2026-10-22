package com.huaweicloud.sdk.modelarts.v1.model;

import java.util.Objects;

/**
 * **参数解释：** 智能分流开启字段。 **取值范围：** [true, false]。
 */
public class SmartRoutingEnable {

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
        sb.append("class SmartRoutingEnable {\n");
        sb.append("}");
        return sb.toString();
    }

}

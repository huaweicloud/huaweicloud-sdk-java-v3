package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * **参数解释**： 处理状态 **约束限制**: 不涉及 **取值范围**: - mark_as_trust：标记为可信 - mark_as_suspicious：标记为可疑 - isolate_and_kill：隔离查杀  **默认取值**: 不涉及 
 */
public class ProcessHandleMethod2 {

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
        sb.append("class ProcessHandleMethod2 {\n");
        sb.append("}");
        return sb.toString();
    }

}

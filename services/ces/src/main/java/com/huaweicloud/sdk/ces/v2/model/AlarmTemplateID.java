package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 告警规则关联告警模板ID，如果传了，告警规则关联的策略会和告警模板策略联动变化
 */
public class AlarmTemplateID {

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
        sb.append("class AlarmTemplateID {\n");
        sb.append("}");
        return sb.toString();
    }

}

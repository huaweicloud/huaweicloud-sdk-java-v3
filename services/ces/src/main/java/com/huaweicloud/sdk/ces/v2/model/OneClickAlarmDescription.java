package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释** 一键告警描述 **约束限制** 不涉及 **取值范围** 字符长度在0到256之间 **默认取值** 空字符串 
 */
public class OneClickAlarmDescription {

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
        sb.append("class OneClickAlarmDescription {\n");
        sb.append("}");
        return sb.toString();
    }

}

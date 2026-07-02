package com.huaweicloud.sdk.ces.v1.model;

import java.util.Objects;

/**
 * **参数解释** 查询数据截止时间，UNIX时间戳，单位毫秒 **约束限制** from 必须小于to **取值范围** 毫秒级时间戳范围为[1111111111111,9999999999999] **默认取值** 不涉及 
 */
public class ToTimeStampSchema {

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
        sb.append("class ToTimeStampSchema {\n");
        sb.append("}");
        return sb.toString();
    }

}

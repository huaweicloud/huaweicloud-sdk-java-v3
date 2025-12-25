package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释** 关联企业项目ID。 **约束限制** 不涉及。 **取值范围** 只能包含字母、数字、和-，长度为36个字符；或者为0，代表默认企业项目 **默认取值** 不涉及。
 */
public class ExtendRelationId {

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
        sb.append("class ExtendRelationId {\n");
        sb.append("}");
        return sb.toString();
    }

}

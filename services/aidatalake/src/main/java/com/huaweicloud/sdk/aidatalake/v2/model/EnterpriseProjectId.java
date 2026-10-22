package com.huaweicloud.sdk.aidatalake.v2.model;

import java.util.Objects;

/**
 * **参数解释**：企业项目ID，获取方法，请参见[获取企业项目ID](aidatalake_02_0042.xml)。 **约束限制**：不涉及。 **取值范围**：长度为0~128个英文字母、数字、下划线和中划线的组合。 **默认取值**：0。 
 */
public class EnterpriseProjectId {

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
        sb.append("class EnterpriseProjectId {\n");
        sb.append("}");
        return sb.toString();
    }

}

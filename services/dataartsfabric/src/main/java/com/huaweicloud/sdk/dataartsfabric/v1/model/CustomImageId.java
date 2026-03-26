package com.huaweicloud.sdk.dataartsfabric.v1.model;

import java.util.Objects;

/**
 * - **参数解释**：CustomImageId。 - **约束限制**：不涉及。 - **取值范围**：长度为[32,36]的英文字符、数字和中划线(-)的组合。 - **默认取值**：不涉及。 
 */
public class CustomImageId {

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
        sb.append("class CustomImageId {\n");
        sb.append("}");
        return sb.toString();
    }

}
